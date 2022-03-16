FROM openjdk:11-jdk
ADD target/a2censo-0.0.1-SNAPSHOT.jar a2censo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/a2censo-0.0.1-SNAPSHOT.jar"]