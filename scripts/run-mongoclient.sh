#!/bin/bash
MONGO_IP=$( docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' mongo )
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

if [ -z "${MONGO_IP}" ]; then
  echo "Seeme like mongo is down"
  exit 1
fi

docker run --net mongo -ti -v "${DIR}:/src" --rm --name mongo-client mongo mongo --host ${MONGO_IP}
