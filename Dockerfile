FROM openjdk:21
COPY "./target/futbolclub-1.0.0.jar" "app.jar"
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "app.jar"]
