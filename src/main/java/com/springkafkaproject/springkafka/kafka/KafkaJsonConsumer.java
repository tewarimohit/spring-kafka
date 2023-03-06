package com.springkafkaproject.springkafka.kafka;

import com.springkafkaproject.springkafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonConsumer.class);

    public KafkaJsonConsumer() {
    }

    @KafkaListener(
            topics = {"cars_json"},
            groupId = "myGroup"
    )
    public void consume(User user) {
        LOGGER.info(String.format("JSON object received -> %s", user.toString()));
    }
}
