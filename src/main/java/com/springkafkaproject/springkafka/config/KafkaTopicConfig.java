package com.springkafkaproject.springkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    public KafkaTopicConfig() {
    }

    @Bean
    public NewTopic springKafkaTopic() {
        return TopicBuilder.name("cars").build();
    }

    @Bean
    public NewTopic springKafkaJsonTopic() {
        return TopicBuilder.name("cars_json").build();
    }
}
