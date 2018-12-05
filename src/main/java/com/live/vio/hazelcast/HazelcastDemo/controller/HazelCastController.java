package com.live.vio.hazelcast.HazelcastDemo.controller;

import com.live.vio.hazelcast.HazelcastDemo.domain.VodBeam;
import com.live.vio.hazelcast.HazelcastDemo.domain.VodBeamDTO;
import com.live.vio.hazelcast.HazelcastDemo.response.IApIResponse;
import com.live.vio.hazelcast.HazelcastDemo.response.impl.APIResponse;
import com.live.vio.hazelcast.HazelcastDemo.services.HazelcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class HazelCastController {

    @Autowired
    private HazelcastService hservice;

    @RequestMapping(method = RequestMethod.POST,value = "/insert")
    public ResponseEntity insertBeamDetails(@Valid @RequestBody VodBeam vodBeamRequest){

        VodBeamDTO beam= hservice.insertBeamDetails(vodBeamRequest);

        IApIResponse response=new APIResponse();
        response.setData(beam);


       return  ResponseEntity.status(200).body(response);
    }

    @RequestMapping(value = "/getdetailsbyid")
    public ResponseEntity getBeamDetailsById(@RequestParam(value = "id") int id){

        VodBeamDTO beam= hservice.getBeamDetailsById(id);

        IApIResponse response=new APIResponse();
        response.setData(beam);


        return  ResponseEntity.status(200).body(response);
    }

}
