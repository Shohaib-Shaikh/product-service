# Start with a base image containing Java runtime
FROM openjdk:11

# Add Maintainer Info
LABEL maintainer="shohaibxshaikh@gmail.com"

RUN mkdir -p /opt/project
ADD target/product-service.jar /opt/project
WORKDIR /opt/project

# Make port 9095 available to the world outside this container
EXPOSE 9095

ENTRYPOINT java -jar product-service.jar