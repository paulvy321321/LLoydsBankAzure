FROM openjdk:17-oracle
ADD target/lloydsazure-0.0.1-SNAPSHOT.jar lloydsazure-0.0.1-SNAPSHOT.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "lloydsazure-0.0.1-SNAPSHOT.jar"]