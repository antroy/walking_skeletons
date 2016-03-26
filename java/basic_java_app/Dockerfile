FROM java:8

ENV JAR_VERSION 0.0.1-SNAPSHOT
ENV NAME "from dockerfile"

WORKDIR /usr/src/app

COPY target/basic-app-${JAR_VERSION}.jar ./
COPY scripts/* ./

ENTRYPOINT ["bash", "run.sh"]
