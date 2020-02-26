FROM gradle:6.2.1-jdk11 as build

WORKDIR /app
COPY build.gradle .
COPY src src
RUN gradle clean build -xtest

FROM openjdk:11-jre-slim

WORKDIR /app
EXPOSE 8080
ENV STORE_ENABLED=true
ENV WORKER_ENABLED=true
COPY --from=build /app/build/lifegame-1.0-SNAPSHOT.jar /app

CMD ["java", "-jar", "lifegame-1.0-SNAPSHOT.jar"]
