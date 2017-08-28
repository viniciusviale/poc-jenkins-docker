FROM jenkins/jenkins:lts
MAINTAINER Vinicius Viale Pinheiro

USER root

RUN mkdir /var/log/jenkins
RUN mkdir /var/cache/jenkins
RUN chown -R jenkins:jenkins /var/log/jenkins
RUN chown -R jenkins:jenkins /var/cache/jenkins

# Install default plugins
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

# Copy in the Docker certs, we'll use /usr/local/etc for them
#COPY certs/ca-key.pem /usr/local/etc/jenkins/certs/ca-key.pem
#COPY certs/ca.pem /usr/local/etc/jenkins/certs/ca.pem
#COPY certs/cert.pem /usr/local/etc/jenkins/certs/cert.pem
#COPY certs/key.pem /usr/local/etc/jenkins/certs/key.pem

# Make sure cert permissions are set correctly
#RUN chmod +r /usr/local/etc/jenkins/certs/ca.pem
#RUN chmod +r /usr/local/etc/jenkins/certs/cert.pem
#RUN chown -R jenkins:jenkins /usr/local/etc/jenkins

USER jenkins

COPY config.xml /usr/share/jenkins/ref/config.xml
COPY disable-jenkins-cli.groovy /usr/share/jenkins/ref/init.groovy.d/disable-jenkins-cli.groovy

RUN echo 2.7.1 > /usr/share/jenkins/ref/jenkins.install.UpgradeWizard.state
RUN echo 2.7.1 > /usr/share/jenkins/ref/jenkins.install.InstallUtil.lastExecVersion

ENV JAVA_OPTS="-Xmx2048m"
ENV JENKINS_OPTS="--logfile=/var/log/jenkins/jenkins.log --webroot=/var/cache/jenkins/war"
