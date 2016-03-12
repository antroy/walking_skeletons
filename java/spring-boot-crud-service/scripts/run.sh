#!/bin/bash

#export name="Blah di blah"
./mvnw install -DskipTests
#java -Dname="Brian the Fox" -jar target/spring-boot-rest-service-0.0.1-SNAPSHOT.jar

java -jar target/spring-boot-rest-service-0.0.1-SNAPSHOT.jar
