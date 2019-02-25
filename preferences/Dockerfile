FROM openjdk:8u191-jre-alpine3.9
MAINTAINER openjdk
#RUN apk --no-cache add netcat-openbsd
COPY target/preferences-0.0.1-SNAPSHOT.jar /opt/lib/
#COPY preferences-entrypoint.sh /opt/bin/preferences-entrypoint.sh
#RUN chmod 755 /opt/bin/preferences-entrypoint.sh
CMD ["java","-jar","/opt/lib/preferences-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080