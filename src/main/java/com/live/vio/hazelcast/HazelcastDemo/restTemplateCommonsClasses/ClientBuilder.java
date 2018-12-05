package com.live.vio.hazelcast.HazelcastDemo.restTemplateCommonsClasses;

import com.live.vio.hazelcast.HazelcastDemo.domain.VodBeamDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public class ClientBuilder {

   private static  RestTemplateBuilder builder;

    private static ClientBuilder clientbuilder = new ClientBuilder();

    public static ClientBuilder getInstance(RestTemplateBuilder builder1) {

       builder = builder1;
        return clientbuilder;
    }

    public Object postResponse(Object requestData, String url) {

        HttpEntity<Object> requestEntity;

        IDMResponse responseDTO = null;

        RestTemplate template = builder.build();
        try {

            requestEntity = new HttpEntity(requestData);


             responseDTO =  template.postForObject(url, requestEntity, DMResponse.class);



            return responseDTO.getData();

        } catch (Exception e) {
            System.out.print("hiiii");

            throw new RuntimeException("execption occur in rest");
        }

    }

    public Object postResponse(Object requestData, String url, HttpHeaders headers) {

        HttpEntity<Object> requestEntity;

        IDMResponse responseDTO = null;

        RestTemplate template = builder.build();
        try {

            requestEntity = new HttpEntity(requestData,headers);


            responseDTO =template.postForObject(url, requestEntity, DMResponse.class);

        } catch (Exception e) {

            throw new RuntimeException("execption occur in rest");
        }


        if (responseDTO.getData() != null && responseDTO.getCode() == 200) {

            return responseDTO.getData();

        }
        throw new RuntimeException("execption occur in rest");

    }

    public Object getResponse(String url) {



        IDMResponse responseDTO = null;

        RestTemplate template = builder.build();
        try {




            responseDTO =template.getForObject(url, DMResponse.class);

        } catch (Exception e) {
            e.printStackTrace();

            throw new RuntimeException("execption occur in rest");
        }


        if (responseDTO.getData() != null && responseDTO.getCode() == 200) {

            return responseDTO.getData();

        }
        throw new RuntimeException("execption occur in rest");

    }

}
