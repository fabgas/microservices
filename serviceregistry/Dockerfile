FROM java:8-jre

ENV MICROSERVICE_FILE target/serviceregistry-0.0.1-SNAPSHOT.jar

# Set the location of the verticles
ENV MICROSERVICE_HOME /opt/verticles

EXPOSE 8761

COPY $MICROSERVICE_FILE $MICROSERVICE_HOME/


WORKDIR $MICROSERVICE_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["java -Dspring.profiles.active=docker  -jar serviceregistry-0.0.1-SNAPSHOT.jar"]