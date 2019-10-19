print("Initializing config database");

db['mongo-config-testingbed'].insert({
  "source": {
    "app": {
      "message": "Hello from Spring cloud config MongoDB",
    },
    "cloud": {
      "aws": {
        "credentials": {
          "useDefaultAwsCredentialsChain": "true"
        },
        "stack": {
          "auto": "false"
        },
        "region": {
          "static": "us-east-2",
          "auto": "false"
        }
      }
    },
    "spring": {
      "rabbitmq": {
        "host": "localhost",
        "port": "5672",
        "username": "guest",
        "password": "guest"
      }
    }
  }
});

db['mongo-config-testingbed'].insert({
  "profile": "dev",
  "source": {
    "app": {
      "message": "Hello from Spring cloud config MongoDB, DEV profile"
    }
  }
});