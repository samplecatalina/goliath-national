FROM openjdk:21-jdk-slim
WORKDIR /app
RUN mkdir -p /app/libs
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v1.33.5/opentelemetry-javaagent.jar /app/libs/opentelemetry-javaagent-1.33.5.jar
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"] 