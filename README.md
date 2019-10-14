# Spring Cloud Config MongoDB TestingBed

This is a sample application which demonstrates how to use Spring cloud config while storing configuration in MongoDB. 
It also supports notifications using Spring Cloud Bus AMQP. 

In this project we have 2 modules:
* **config-server** - Spring cloud config server
* **client** - Simple webapp which reads a configuration property (app.message) and prints it to the screen

# Setup

Before running the sample project you will need to start both Mongo and RabbitMQ (needed to support notifications) and load the relevant configuration collection. 
You can achieve this by running the following:

```bash
scripts/run-mongo.sh
scripts/run-mongoinit.sh

# Needed to support notifications
scripts/run-rabbitmq.sh
```

# Running the application

Run config-server and client applications (you can use Spring boot's run task):
```bash
./gradlew :config-server:bootRun
./gradlew :client:bootRun
```
Open a browser and access the following URL: http://localhost:8080/.
   This should return the default message which is "Hello from Spring cloud config MongoDB, DEV profile" (the application uses the "dev" profile).
   
# Changing the default message

The configuration is stored in "config" database inside "mongo-config-testingbed" collection.
You can use "run-mongoclient.sh" to open a mongo client and update the message stored in the collection.
Once the message is updated, call the server's monitor URL to trigger a notification. Example:

```bash
curl -d '{"path":"mongo-config-testingbed"}' -H "Content-Type: application/json" -X POST http://localhost:8081/monitor
```

Now you can call the client's rest API to see the updated message.
   
# References

* [Spring Cloud Config MongoDB](https://github.com/spring-cloud-incubator/spring-cloud-config-server-mongodb)