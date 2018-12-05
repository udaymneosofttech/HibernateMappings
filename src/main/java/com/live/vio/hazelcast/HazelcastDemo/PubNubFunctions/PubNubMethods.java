package com.live.vio.hazelcast.HazelcastDemo.PubNubFunctions;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.live.vio.hazelcast.HazelcastDemo.configurations.PubNubConfig;
import com.live.vio.hazelcast.HazelcastDemo.domain.VodBeamDTO;
import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.models.consumer.PNPublishResult;
import com.pubnub.api.models.consumer.PNStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PubNubMethods {

    @Autowired
    PNConfiguration pconfig;

    PubNub pub;


    @PostConstruct
    public void init() {

        if (pub == null)
            this.pub = new PubNub(pconfig);
    }

    ObjectMapper mapper=new ObjectMapper();

    public void publishBeamDetails(VodBeamDTO vodbeamdto) throws JsonProcessingException {

        JsonObject json=new JsonObject();
        json.addProperty("beamid",vodbeamdto.getBeamId());
        json.addProperty("type","insertbeamdetails");
        json.addProperty("beamdetails",mapper.writeValueAsString(vodbeamdto));

        String channelId="insert.0000125667";

        pub.publish()
                .message(json)
                .channel(channelId)
                .async(new PNCallback<PNPublishResult>() {
                    @Override
                    public void onResponse(PNPublishResult result, PNStatus status) {
                        //  handle publish result, status always present, result if successful
                        //  status.isError to see if error happened
                        if (!status.isError()) {
                            System.out.print("pub timetoken: " + result.getTimetoken());
                        }
                        System.out.print("pub status code: " + status.getStatusCode());
                    }
                });
    }


}
