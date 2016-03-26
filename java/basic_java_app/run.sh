#!/bin/bash

./mvnw install

echo
echo
java -jar target/basic-app-0.0.1-SNAPSHOT.jar
