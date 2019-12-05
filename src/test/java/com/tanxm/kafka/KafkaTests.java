package com.tanxm.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaTests {

    @Resource
    KafkaTemplate kafkaTemplate;

    @Test
    public void contextLoads() {
        kafkaTemplate.send("test", 0,12,"My name is Tanxiaoman");
    }

}

