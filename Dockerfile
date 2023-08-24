# Use OpenJDK for the runtime
FROM openjdk:17-jdk-slim as runtime

# Set the working directory
WORKDIR /app

# Copy the pre-built JAR file
COPY target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
