# poc-jenkins-docker
Putting Jenkins in a Docker Container

# Pre-requirements
- Windows 10 Pro
- Hyper-V Manager 10
- Docker CE for Windows
- Git Bash

# Initial steps
- Use Docker-Machine to create a new virtual machine. This command downloads a lightweight Linux distribution called boot2docker. See more information [here](https://docs.docker.com/get-started/part4/#localwin).
- Use Git Bash to log in to the virtual machine ("ssh docker@<vm-ip-address>" and password "tcuser")
- Download this repository to a local folder in your virtual machine.
- [Install](https://github.com/docker/compose/releases) Docker-Compose.
- Run Docker-Compose commands:
  - docker-compose build: build dockerfiles.
  - docker-compose up -d: start new docker containers.
  - docker-compose stop: stop running docker containers.
  - docker-compose start: start docker containers.
  
