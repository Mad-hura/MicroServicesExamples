FROM openjdk:17-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/EurekaClientPaymentService-0.0.1-SNAPSHOT.jar  payment.jar
ENTRYPOINT [ "sh", "-c", "java -jar /payment.jar" ]