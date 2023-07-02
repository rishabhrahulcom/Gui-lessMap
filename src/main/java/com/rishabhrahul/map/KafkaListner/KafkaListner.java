package com.rishabhrahul.map.KafkaListner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class KafkaListner {

    @KafkaListener(topics ="path", groupId = "PathONE")
    void listners(String data){
        int count = 0;
        System.out.println("COUNT = "+  ++count + data);
        // logic goes here

    }
}
