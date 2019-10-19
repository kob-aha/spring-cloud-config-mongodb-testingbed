package edu.ka.testingbed.cloudconfigmongo.sqsconnector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Profile;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static org.springframework.cloud.aws.messaging.core.SqsMessageHeaders.SQS_DEDUPLICATION_ID_HEADER;
import static org.springframework.cloud.aws.messaging.core.SqsMessageHeaders.SQS_GROUP_ID_HEADER;

@Component
@Profile("sender")
public class SqsSender {

    private static final Logger LOG = LoggerFactory.getLogger(SqsSender.class);

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @Value("${cloud.aws.end-point.uri}")
    private String sqsEndPoint;

    @PostConstruct
    public void sendMessage() {

        LOG.info("Sending a message in SQS");

        Message<String> message = MessageBuilder
                .withPayload("hello from Spring Boot")
                .setHeaderIfAbsent(SQS_GROUP_ID_HEADER, "test")
                .setHeaderIfAbsent(SQS_DEDUPLICATION_ID_HEADER, "test")
                .build();
        queueMessagingTemplate.send(sqsEndPoint, message);
    }
}
