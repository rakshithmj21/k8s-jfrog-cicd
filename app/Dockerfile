# Use OpenJDK as base image
FROM openjdk:17-jdk-slim

# Copy built jar from Maven target folder
COPY target/*.jar app.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
