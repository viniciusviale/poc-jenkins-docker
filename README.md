# poc-jenkins-docker
Putting Jenkins in a Docker Container

# Pre-requirements
- Windows 10 Pro
- Oracle Virtual Box 5.1.26
- Vagrant 1.9.7
- Git

# Initial steps
- Download this repository to a local folder in your host.
- From the local folder, type the following command:

```
vagrant up
```

# Containers description
- Container 1: NGinX reverse proxy
- Container 2: Jenkins running behind NGinX
- Container 3: Data Container to persist Jenkins configurations
- Containers created by Jenkins jobs: Jenkins slaves

# Additional Information

- Run Docker-Compose commands:

```  
docker-compose build: build dockerfiles.
docker-compose up -d: start new docker containers.
docker-compose stop: stop running docker containers.
docker-compose start: start docker containers.
docker-compose down: stop and remove containers.
```

- Run Ansible requirements:

```
ansible-galaxy install -r [requirements.yml]
```

- Run Ansible playbook:

```
ansible-playbook -k [docker.yml]
```