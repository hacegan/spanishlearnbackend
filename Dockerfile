# Use an official Java 17 image as a base
FROM openjdk:17-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the Spring Boot application WAR file into the container
COPY ./target/myapp.war /app/

# Expose the port that the application will use
EXPOSE 8080

