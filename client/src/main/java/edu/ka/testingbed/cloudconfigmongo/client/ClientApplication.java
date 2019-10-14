package edu.ka.testingbed.cloudconfigmongo.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication{

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
