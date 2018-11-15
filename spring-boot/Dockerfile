FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD /target/spring-boot-0.0.1-SNAPSHOT.jar spring-boot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","spring-boot-0.0.1-SNAPSHOT.jar"]