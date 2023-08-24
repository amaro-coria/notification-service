# Use GraalVM for the runtime
FROM oracle/graalvm-ce:21.3.0-java17 as runtime

# Set the working directory
WORKDIR /app

# Copy the pre-built JAR file
COPY target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]