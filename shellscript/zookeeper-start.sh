#!/bin/bash
KAFKA_HOME=/home/kuma/kafka/kafka-2.6.1-src
nohup bin/zookeeper-server-start.sh -daemon config/zookeeper.properties