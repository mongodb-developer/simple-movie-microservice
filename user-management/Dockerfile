FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/user-management-0.0.1-SNAPSHOT.jar user-management.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","user-management.jar"]
