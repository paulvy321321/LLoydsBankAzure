/*
package com.lloyds.azure.lloydsazure.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class PaymentConsumer {

    private final Logger logger = LoggerFactory.getLogger(PaymentConsumer.class);

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message){
        logger.info(String.format("$$$ -> Consumed Message -> %s",message));
    }
}
*/
