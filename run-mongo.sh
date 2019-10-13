#!/bin/bash

if ! `docker network ls | grep -e "\bmongo\b" &> /dev/null`; then
  echo "Creating mongo network"
  docker network create mongo
fi

docker run --net mongo -d -p 27017:27017 --rm --name mongo mongo:latest
