package com.rishabhrahul.map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.ActiveProfiles;

import java.util.HashMap;
import java.util.Map;



@SpringBootTest
public class anotherTest {
    @Test
    void contextLoads() throws JsonProcessingException {
        String nodeJson= "{\"_id\":112089734,\"_timestamp\":\"2014-06-03T09:03:32.000+05:30\",\"_version\":2,\"nd\":[{\"_ref\":1275028820},{\"_ref\":1275028701},{\"_ref\":1275028783},{\"_ref\":1275028887},{\"_ref\":1275028820}],\"tag\":[{\"_k\":\"building\",\"_v\":\"yes\"},{\"_k\":\"source\",\"_v\":\"Geoportal Berlin / Hausumringe\"}]}";
        // construct a adjacency list
        // a->b->c
        // create a node a,
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(nodeJson);
        System.out.println(jsonNode.get("_id"));
        //for(int i =  0 ; i < )
    }

    @Test
    void emptyList(){
        Map<Integer , Integer> m = new HashMap<Integer,Integer>();
        System.out.println(m.get(1));

    }


}
