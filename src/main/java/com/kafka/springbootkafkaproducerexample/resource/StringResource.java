package com.kafka.springbootkafkaproducerexample.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafkaString")
public class StringResource {

    @Autowired
    //private KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "kafka_Example";

    @GetMapping("/publish/{message}")
    public String post(@PathVariable("message") final String message){
        //kafkaTemplate.send(TOPIC,message);
        return "Publised successfully";
    }
}
