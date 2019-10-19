package edu.ka.testingbed.cloudconfigmongo.sqsconnector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SqsConnectorApplication {

//	@Autowired
//	private SqsSender sqsClient;

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SqsConnectorApplication.class, args);
		System.out.println("Finished loading app. Active profile: " + context.getEnvironment().getActiveProfiles()[0]);
	}

//	@Override
//	public void run(String... args) throws Exception {
////
//	}
}
