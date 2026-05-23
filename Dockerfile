FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target\QuestionService-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 7000
ENTRYPOINT ["java","-jar","app.jar"]
