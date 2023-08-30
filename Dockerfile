FROM eclipse-temurin:17
COPY target/dev-ops.jar  dev-ops.jar
CMD [ "java","-jar","dev-ops.jar"]