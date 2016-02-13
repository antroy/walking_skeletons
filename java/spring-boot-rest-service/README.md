-------------------------------
Spring Boot RESTful Web Service
-------------------------------

This skeleton provides a simple no-auth RESTful web service. The mvnw wrapper (https://github.com/takari/maven-wrapper) is provided for a quick start.

The initial project was generated using the useful http://start.spring.io/ online tool.

The docker container is used as follows.

Boot2Docker
-----------

If using MacOS or Windows, then you will need to install and run boot2docker.

``boot2docker up`` - starts the container VM.
``$(boot2docker shellinit)`` - enables docker to talk to the boot2docker VM. Can be put in .bashrc.
``boot2docker ip`` - the IP address of the boot2docker VM. Can also be used like this for convenience:
    ``curl `boot2docker ip`:8080``

Docker
------

Build the image
    ``docker build -t antroy/java-simple-rest``

Run the image (with -d to run as daemon), exposing port 8080 on the image to host port 1234
    ``docker run -d -p 8080:1234 antroy/java-simple-rest``

List images:
    ``docker ps -a``



