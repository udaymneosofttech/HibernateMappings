package com.live.vio.hazelcast.HazelcastDemo.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.live.vio.hazelcast.HazelcastDemo.PubNubFunctions.PubNubMethods;
import com.live.vio.hazelcast.HazelcastDemo.configurations.QueueManager;
import com.live.vio.hazelcast.HazelcastDemo.domain.VodBeam;
import com.live.vio.hazelcast.HazelcastDemo.domain.VodBeamDTO;
import com.live.vio.hazelcast.HazelcastDemo.restTemplateCommonsClasses.ClientBuilder;
import com.live.vio.hazelcast.HazelcastDemo.restTemplateCommonsClasses.IDMResponse;
import com.live.vio.hazelcast.HazelcastDemo.services.HazelcastService;
import com.pubnub.api.PNConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class HazelCastServiceImpl implements HazelcastService {

    @Autowired
    RestTemplateBuilder builder;

    @Autowired
    PubNubMethods putils;

    @Autowired
    QueueManager queueManager;

    @Override
    public VodBeamDTO insertBeamDetails(VodBeam vodBeamRequest) {

        ObjectMapper objectMapper=new ObjectMapper();

        String url="http://localhost:2014/data/insert";
        //IDMResponse responsedto=null;

        try {

            ClientBuilder client = ClientBuilder.getInstance(builder);

            Object   responsedto  =client.postResponse(vodBeamRequest,url);

            // Parse the response
            VodBeamDTO dataMap = objectMapper.convertValue(responsedto, VodBeamDTO.class);

          //  putils.publishBeamDetails(dataMap);

            queueManager.videoBeamDetails(dataMap);

            return dataMap;

        }catch (Exception e){
            throw new RuntimeException("some internall error");

        }
    }

    @Override
    public VodBeamDTO getBeamDetailsById(int beamid) {

        ObjectMapper objectMapper=new ObjectMapper();

        String url="http://localhost:2014/data/getdetailsbyid?id="+beamid;
        //IDMResponse responsedto=null;

        try {

            ClientBuilder client = ClientBuilder.getInstance(builder);

            Object   responsedto  =client.getResponse(url);
           System.out.print(responsedto);
            // Parse the response
            VodBeamDTO dataMap = objectMapper.convertValue(responsedto, VodBeamDTO.class);
            return dataMap;

        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("some internall error");

        }

    }
}
