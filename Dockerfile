FROM maven:3.8.7-eclipse-temurin-19-alpine AS build
COPY . .
RUN mvn clean package -DskipTests
FROM eclipse-temurin:19
COPY --from=build /target/*.jar ipl-stats.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ipl-stats.jar"]