package edu.ka.testingbed.cloudconfigmongo.sqsconnector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.context.annotation.Profile;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static org.springframework.cloud.aws.messaging.core.SqsMessageHeaders.SQS_DEDUPLICATION_ID_HEADER;
import static org.springframework.cloud.aws.messaging.core.SqsMessageHeaders.SQS_GROUP_ID_HEADER;

@Component
@Profile("reciever")
public class SqsReciever {

    private static final Logger LOG = LoggerFactory.getLogger(SqsReciever.class);

//    @SqsListener("test.fifo")
    @SqsListener("springCloudBus")
    public void getMessage(String message) {
        LOG.info(" **************** Message from SQS Queue - " + message +
                " **************** ");
    }
}
