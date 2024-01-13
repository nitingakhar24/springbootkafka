package com.messaging.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    private static final String TOPIC_NAME = "my-messaging-topic";

    @Bean
    public NewTopic myMessagingTopic() {
        return TopicBuilder.name(TOPIC_NAME).build();
    }

}
