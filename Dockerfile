# Use an official Java 17 image as a base
FROM openjdk:17-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the Spring Boot application WAR file into the container
COPY target/myapp.war /app/

# Expose the port that the application will use
EXPOSE 8080

# Run the command to start the Spring Boot application when the container launches
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "-Dspring.profiles.active=container", "myapp.war"]