package com.tanxm.kafka.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * description: Kafka消费者消费消息
 * author: tanxm
 * date: 2019-12-05
 */
@Component
@Slf4j
public class KafkaConsumer extends Thread {

    @KafkaListener(topics = {"test"}, groupId = "receiver")
    public void registryReceiver(ConsumerRecord<Integer, String> integerStringConsumerRecords) {
        log.info(integerStringConsumerRecords.value());
    }
}