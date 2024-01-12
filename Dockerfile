
FROM openjdk:17-jdk

LABEL authors="nyaugenya"

ENTRYPOINT ["top", "-b"]

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.ja /app/demo.jar

EXPOSE 1000

CMD ["java", "-jar", "demo.jar"]
