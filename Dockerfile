FROM openjdk
EXPOSE 8080
COPY ./target/hubspot-0.0.1-SNAPSHOT.jar hubspot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","hubspot-0.0.1-SNAPSHOT.jar"]