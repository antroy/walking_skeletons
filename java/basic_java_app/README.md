--------------------
Java Commandline App
--------------------

This skeleton provides a simple command-line executable jar application. The mvnw wrapper (https://github.com/takari/maven-wrapper) is provided for a quick start.

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

    ``docker build -t antroy/java-simple-rest .``

* Run the image (with -d to run as daemon), exposing port 8080 on the image to host port 1234

    ``docker run -d antroy/java-simple-rest``

* List images

    ``docker ps -a``

Configuration
-------------

To allow Docker to pick up properties as Environment Variables that can be given to Docker, there are a number of options, but probably the simplest is to have a Coniguration class that pulls the values from environment variables with possible defaults. This is what is done in this example.
