#基础镜像
FROM openjdk:8


ADD zzz-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/app.jar","--spring.profiles.active=dev"]

