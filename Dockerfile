#
# Build stage
#
FROM maven:3.8.3-openjdk-17-slim AS build
COPY . /app/demo/
RUN mvn -f /app/demo/ clean package

#
# Package stage
#
FROM openjdk:latest
RUN  echo --from=build /app/demo/target/demo.jar
COPY --from=build /app/demo/target/demo.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8000","-jar","/usr/local/lib/demo.jar"]