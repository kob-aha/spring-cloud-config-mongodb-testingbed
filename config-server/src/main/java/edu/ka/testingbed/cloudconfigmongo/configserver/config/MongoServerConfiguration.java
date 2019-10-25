package edu.ka.testingbed.cloudconfigmongo.configserver.config;

import org.springframework.cloud.config.server.mongodb.EnableMongoConfigServer;
import org.springframework.context.annotation.Profile;

@Profile("mongo")
@EnableMongoConfigServer
public class MongoServerConfiguration {
}
