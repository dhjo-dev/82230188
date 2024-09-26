FROM cepgbaseacr.azurecr.io/docker.io/openjdk:17-slim

CMD ["./mvnw", "clean", "package"]

VOLUME /tmp

ARG JAR_FILE_PATH=target/*.jar

COPY ${JAR_FILE_PATH} /app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]