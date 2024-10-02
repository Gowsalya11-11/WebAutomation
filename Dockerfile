FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine

WORKDIR /app

COPY pom.xml .
COPY src src
COPY target target

ENTRYPOINT ["mvn", "clean", "package", "-DskipTests"]

CMD ["java", "-jar", "target//WebAutomation-1.0-SNAPSHOT.jar ."]