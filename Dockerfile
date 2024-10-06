FROM openjdk:11
EXPOSE 8080
ADD target/CICDApplication-0.0.1-SNAPSHOT.jar CICDApplication-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/CICDApplication-0.0.1-SNAPSHOT.jar"]