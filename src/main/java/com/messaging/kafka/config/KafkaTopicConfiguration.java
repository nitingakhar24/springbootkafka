package com.messaging.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.messaging.kafka.constants.MessagingConstants.TOPIC_NAME;

@Configuration
public class KafkaTopicConfiguration {


    @Bean
    public NewTopic myMessagingTopic() {
        return TopicBuilder.name(TOPIC_NAME).build();
    }

}
