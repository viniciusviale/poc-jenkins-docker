FROM jenkins/jenkins:lts
MAINTAINER Vinicius Viale Pinheiro

USER root

RUN mkdir /var/log/jenkins
RUN mkdir /var/cache/jenkins
RUN chown -R jenkins:jenkins /var/log/jenkins
RUN chown -R jenkins:jenkins /var/cache/jenkins

# Install default plugins
COPY plugins.txt /tmp/plugins.txt
RUN /usr/local/bin/plugins.sh /tmp/plugins.txt

# Copy in the Docker certs, we'll use /usr/local/etc for them
COPY certs/ca-key.pem /usr/local/etc/jenkins/certs/ca-key.pem
COPY certs/ca.pem /usr/local/etc/jenkins/certs/ca.pem
COPY certs/cert.pem /usr/local/etc/jenkins/certs/cert.pem
COPY certs/key.pem /usr/local/etc/jenkins/certs/key.pem

# Make sure cert permissions are set correctly
RUN chmod +r /usr/local/etc/jenkins/certs/ca.pem
RUN chmod +r /usr/local/etc/jenkins/certs/cert.pem
RUN chown -R jenkins:jenkins /usr/local/etc/jenkins

USER jenkins

ENV JAVA_OPTS="-Xmx8192m"
ENV JENKINS_OPTS="--logfile=/var/log/jenkins/jenkins.log --webroot=/var/cache/jenkins/war"
