FROM openjdk:17-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/GreetService-0.0.1-SNAPSHOT.jar  greet.jar
ENTRYPOINT [ "sh", "-c", "java -jar /greet.jar" ]