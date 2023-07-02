package com.rishabhrahul.map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication
public class Demo4Application {
    Logger logger = LoggerFactory.getLogger(Demo4Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Demo4Application.class, args);
    }
@Bean
CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate){
    return args -> {
        for (int i = 26; i <= 40; i++) {
            List<String> allLines = Files.readAllLines(Paths.get("src/main/resources/berlinWay/part-000" + i));
            List<String> lines = null;
            for (String line : allLines) {

                kafkaTemplate.send("path", line);

            }


        }
        ;
    };

    }
}


