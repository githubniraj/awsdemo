#Docker container is a running instance of a Docker image.
#Whereas Image is like a stopped Container.
#A Docker image is a read-only template with instructions for how to create a Docker container.
#FROM keyword tells Docker the base image on which we want our image built. In our case, OpenJDK 8 official docker image.
#ADD keyword adds the jar we’ve created getting it from the new /target directory.
#ENTRYPOINT keyword specifies commands to run the jar file.
#EXPOSE keyword makes port 8080 available outside the Docker container.

#FROM openjdk:8
#ADD target/aws-docker-project.jar aws-docker-project.jar
#ENTRYPOINT ["java", "-jar","aws-docker-project.jar"]
#EXPOSE 8080

FROM openjdk:11-jre-slim

#Set the working directory to /app
WORKDIR /app
COPY target/aws-docker-project.jar /app
#Run the jar file when the container starts
CMD ["java", "-jar","aws-docker-project.jar"]
EXPOSE 8080

#To build our Docker image using the Dockerfile, run:
# dockerhubid/nameoftherepository:nameoftheimage .
#docker build -t nirajdrn/aws-demo:awsdemov1 .

#docker push nirajdrn/aws-demo:awsdemoV1

#removes local docker image
#docker image rm nirajdrn/aws-demo:awsdemoV1

#Docker run the container, it sees if the image available locally if not it goes to
#docker registry and run the container for us
#docker container run -d --name awsdemo -p 8080:8080 nirajdrn/aws-demo:awsdemoV1

#Stop container
#docker container stop awsdemo

#See container
#docker container ls -a



