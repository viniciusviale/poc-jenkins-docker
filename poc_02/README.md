# poc-02
Putting Jenkins in a Docker Container

# Containers description
- Container 1: NGinX reverse proxy
- Container 2: Jenkins running behind NGinX
- Container 3: Data Container to persist Jenkins configurations
- Container 4: Jenkins slave

# Instructions
- Create your SSH Key Pair
- Copy your PEM keys from /.docker/machine/certs to jenkins-master/certs
- Run Docker-Compose commands:
  - docker-compose build: build dockerfiles.
  - docker-compose up -d: start new docker containers.
  - docker-compose stop: stop running docker containers.
  - docker-compose start: start docker containers.
  - docker-compose down: stop and remove containers.
- After start, point your browser to: http://yourdockerhostip  
- Create a new credential in Jenkins and add your SSH private key
- Create a new credential in Jenkins and add your Docker certificates directory
- Create a new cloud configuration in Jenkins using the Jclouds plugin, add your dockerhost URL with port 2376 and select your docker certificates directory credential. Finally, test the connection.
- Assuming you got a successful version response when testing the connection, we can proceed.
- Add a new docker template: 
  - For the Docker Image Field enter: “jenkins_slave”
  - Make sure “Remote Filing System Root” is set to “/home/jenkins”
  - For “Labels” add “testslave”
  - For “usage” change the selection to “Only build jobs with label restrictions matching this node”
  - Make sure Launch method is set to “Docker SSH computer launcher”
  - For Credentials select “jenkins” (the option you created earlier)
  - For “Remote FS root Mapping” make sure it is also “/home/jenkins”
  - Click “Save” at the bottom of the configuration page
- Create a new freestyle project in Jenkins:
  - Make sure “Restrict where this project can be run” is checked
  - Enter “testslave” in the Label Expression”
  - Scroll down and select “Execute shell” from the “Add build step” drop down
  - In the Execute Shell “command” box, enter: ‘ echo "Hello World!" ’
  - Click “save”
- Now you can build.


