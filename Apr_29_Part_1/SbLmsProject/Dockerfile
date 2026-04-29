# Use official Tomcat base image
FROM tomcat:9.0-jdk17

# Clean default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR into Tomcat's webapps folder
COPY target/SbLms.war /usr/local/tomcat/webapps/SbLms.war

# Expose Tomcat's port
EXPOSE 8811
