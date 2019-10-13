print("Initializing config database");

db['mongo-config-testingbed'].insert({
  "source": {
    "app": {
      "message": "Hello from Spring cloud config MongoDB"
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