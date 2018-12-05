package com.live.vio.hazelcast.HazelcastDemo.configurations;

import com.live.vio.hazelcast.HazelcastDemo.PubNubFunctions.PubNubMethods;
import com.live.vio.hazelcast.HazelcastDemo.domain.VodBeamDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class JMSListener {


    @Autowired
    private QueueManager queueManager;

    @Autowired
    private PubNubMethods pubNubMethods;





    /**
     * call pubnub method
     */

    @JmsListener(destination = "${queue.insert}")
    public void insertLiveWatcher(@Payload final Message<VodBeamDTO> message)
    {
        try
        {

            VodBeamDTO vodBeamDTO= message.getPayload();

            pubNubMethods.publishBeamDetails(vodBeamDTO);

        } catch(Exception ex) {
            ex.printStackTrace();

        }

    }

}