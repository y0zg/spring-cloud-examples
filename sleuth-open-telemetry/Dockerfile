FROM adoptopenjdk/openjdk16

WORKDIR /app

COPY ["build/libs/sleuth-open-telemetry-0.0.1-SNAPSHOT.jar", "sleuth-open-telemetry-0.0.1-SNAPSHOT.jar"]

ENTRYPOINT ["java", "-jar", "sleuth-open-telemetry-0.0.1-SNAPSHOT.jar"]

