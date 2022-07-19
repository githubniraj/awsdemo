#Docker container is a running instance of a Docker image.
#A Docker image is a read-only template with instructions for how to create a Docker container.
#FROM keyword tells Docker the base image on which we want our image built. In our case, OpenJDK 8 official docker image.
#ADD keyword adds the jar we’ve created getting it from the new /target directory.
#ENTRYPOINT keyword specifies commands to run the jar file.
#EXPOSE keyword makes port 8080 available outside the Docker container.

FROM openjdk:8
ADD target/aws-docker-project.jar aws-docker-project.jar
ENTRYPOINT ["java", "-jar","aws-docker-project.jar"]
EXPOSE 8080

#To build our Docker image using the Dockerfile, run:
#docker build -t aws-docker-project.jar .
#docker build -t aws-docker-project.jar:aws-docker-project.jar .

#Finally, we can run our project by starting a Docker container with the previously built image and binding port 8080 on our local machine.

#docker run -p 8080:8080 aws-docker-project.jar

#List all the docker images
#docker images

#REPOSITORY               TAG       IMAGE ID       CREATED        SIZE
#nirajdrn/aws-docker-project.jar   aws-docker-project.jar   d5a9b85b0871   22 hours ago   545MB

#list the docker container
#docker ps

#CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES



#docker push nirajdrn/aws-docker-project.jar:aws-docker-project.jar




