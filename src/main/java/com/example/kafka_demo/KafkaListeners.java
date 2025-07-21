package com.example.kafka_demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "Kafka-demo",
            groupId = "groupId"
    )
    void Listener(String data) {
        System.out.println("Listener received: " + data);

    }

}
