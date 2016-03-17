----------------------------
Spring Boot CRUD Web Service
----------------------------

This skeleton provides a simple no-auth RESTful web service that exposes basic crud functionality against a built in h2 DB. 
The mvnw wrapper (https://github.com/takari/maven-wrapper) is provided for a quick start.

The initial project was generated using the useful http://start.spring.io/ online tool.

The docker container is used as follows.

Boot2Docker
-----------

If using MacOS or Windows, then you will need to install and run boot2docker.

* ``boot2docker up`` - starts the container VM.
* ``$(boot2docker shellinit)`` - enables docker to talk to the boot2docker VM. Can be put in .bashrc.
* ``boot2docker ip`` - the IP address of the boot2docker VM. Can also be used like this for convenience:
    ``curl `boot2docker ip`:8080``

Docker
------

* Build the image

    ``docker build -t antroy/java-simple-crud .``

* Run the image (with -d to run as daemon), exposing port 8080 on the image to host port 1234

    ``docker run -d -p 1234:8080 antroy/java-simple-crud``

* List images

    ``docker ps -a``

