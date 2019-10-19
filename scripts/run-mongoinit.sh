#!/bin/bash 
MONGO_IP=$( docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' mongo )
SCRIPTS_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
ROOT_DIR="$SCRIPTS_DIR/.."
DB_NAME="config"

if [ -z "${MONGO_IP}" ]; then
  echo "Seeme like mongo is down"
  exit 1
fi

docker run --net mongo -ti -v "${ROOT_DIR}:/src" --rm --name mongo-client mongo mongo --host ${MONGO_IP} ${DB_NAME} /src/config-server/src/main/resources/init-config-database.js
