package edu.ka.testingbed.cloudconfigmongo.sqsconnector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqsConnectorApplication implements CommandLineRunner {

	@Autowired
	private SqsClient sqsClient;

	public static void main(String[] args) {
		SpringApplication.run(SqsConnectorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		sqsClient.sendMessage();
	}
}
