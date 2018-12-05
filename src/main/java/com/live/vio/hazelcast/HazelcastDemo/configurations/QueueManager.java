package com.live.vio.hazelcast.HazelcastDemo.configurations;


import com.amazon.sqs.javamessaging.SQSMessagingClientConstants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.live.vio.hazelcast.HazelcastDemo.domain.VodBeamDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Session;
import java.io.Serializable;
import java.util.HashMap;

@Component
public class QueueManager {

    @Resource
    JmsTemplate jmsTemplate;

    ObjectMapper objectMapper = new ObjectMapper();

    @Value("${queue.insert}")
    String insertQueue;

    public void videoBeamDetails(VodBeamDTO dataObject) {


        send(insertQueue, dataObject);
    }

    private <MESSAGE extends Serializable> void send(String queueName, MESSAGE payload) {

        jmsTemplate.send(queueName, new MessageCreator() {

            public javax.jms.Message createMessage(Session session) throws JMSException {
                try {
                    javax.jms.Message createMessage = session.createTextMessage(objectMapper.writeValueAsString(payload));
                    createMessage.setStringProperty(SQSMessagingClientConstants.JMSX_GROUP_ID, "messageGroup1");
                    createMessage.setStringProperty("documentType", payload.getClass().getName());
                    return createMessage;
                } catch (Exception | Error e) {

                    throw new RuntimeException(e);
                }
            }
        });


    }
}
