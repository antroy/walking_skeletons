#!/bin/bash

./mvnw install
java -DNAME="Brian the Fox" -jar target/spring-boot-rest-service-0.0.1-SNAPSHOT.jar
