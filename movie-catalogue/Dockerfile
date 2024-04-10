FROM eclipse-temurin:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/movie-catalogue-0.0.1-SNAPSHOT.jar movie-catalogue.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java","-jar","movie-catalogue.jar"]
