package com.live.vio.hazelcast.HazelcastDemo.configurations;


import com.pubnub.api.PNConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

@Configuration
public class PubNubConfig {


    @Bean
    public PNConfiguration getPconfig(
            @Value("${pubnub.publishKey}") String publishKey,
            @Value("${pubnub.subscribeKey}") String subscribeKey,
            @Value("${pubnub.uuid}") String uuid
             ) {

        PNConfiguration pconfig=new PNConfiguration();
        pconfig.setPublishKey(publishKey);
        pconfig.setSubscribeKey(subscribeKey);
        pconfig.setUuid(uuid);



        return pconfig;
    }


}
