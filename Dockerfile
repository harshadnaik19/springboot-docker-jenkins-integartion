FROM openjdk:8
EXPOSE 9090
ADD target/springboot-docker-jenkins-integartion.jar springboot-docker-jenkins-integartion.jar
ENTRYPOINT ["java","-jar","/springboot-docker-jenkins-integartion.jar"]