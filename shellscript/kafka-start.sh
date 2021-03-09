#!/bin/bash
KAFKA_HOME=/home/kuma/kafka/kafka-2.6.1-src
$KAFKA_HOME/bin/kafka-server-start.sh -daemon $KAFKA_HOME/config/server.properties