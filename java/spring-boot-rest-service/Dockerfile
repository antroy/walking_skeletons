FROM java:8

ENV JAR_VERSION 0.0.1-SNAPSHOT

WORKDIR /usr/src/app

COPY target/* ./
COPY scripts/* ./

EXPOSE 8080

ENTRYPOINT ["bash", "run.sh"]
