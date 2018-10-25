FROM java:8-jre

ENV MICROSERVICE_FILE target/authentication-0.0.1-SNAPSHOT.jar

# Set the location of the verticles
ENV MICROSERVICE_HOME /opt/verticles

EXPOSE 8300

COPY $MICROSERVICE_FILE $MICROSERVICE_HOME/


WORKDIR $MICROSERVICE_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["java  -Dspring.profiles.active=docker -jar authentication-0.0.1-SNAPSHOT.jar"]