# AS <NAME> to name this stage as maven
FROM maven:3.8.4 AS maven

WORKDIR /usr/src/app
COPY . /usr/src/app
# Compile and package the application to an executable JAR
RUN mvn package

# For Java 11,
FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=jumia_challenge.jar

WORKDIR /opt/app


COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/
EXPOSE 8080
ENTRYPOINT ["java","-jar","jumia_challenge.jar"]