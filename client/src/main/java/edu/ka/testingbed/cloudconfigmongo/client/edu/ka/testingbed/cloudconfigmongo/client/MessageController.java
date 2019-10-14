package edu.ka.testingbed.cloudconfigmongo.client.edu.ka.testingbed.cloudconfigmongo.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageController {

    @Value("${app.message}")
    String message;

    @GetMapping("/")
    public String home() {
        return message;
    }
}
