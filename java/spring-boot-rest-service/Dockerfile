FROM java:8

ENV JAR_VERSION 0.0.1-SNAPSHOT
ENV NAME "from dockerfile"

WORKDIR /usr/src/app

COPY target/spring-boot-rest-service-${JAR_VERSION}.jar ./
COPY scripts/* ./

EXPOSE 8080

ENTRYPOINT ["bash", "run.sh"]
