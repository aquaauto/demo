FROM openjdk:8u191-jre-alpine3.9
MAINTAINER openjdk
#RUN apk --no-cache add netcat-openbsd
COPY target/customerprofile-0.0.1-SNAPSHOT.jar /opt/lib/
COPY customerprofile-entrypoint.sh /opt/bin/customerprofile-entrypoint.sh
#RUN chmod 755 /opt/bin/customerprofile-entrypoint.sh
CMD ["java","-jar","/opt/lib/customerprofile-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080