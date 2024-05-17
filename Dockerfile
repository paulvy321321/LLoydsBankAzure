FROM lolhens/baseimage-openjre
ADD target/lloydsazureApp.jar lloydsazureApp.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "springbootApp.jar"]