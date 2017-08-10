# poc-01
Putting Jenkins in a Docker Container

# Containers description
- Container 1: NGinX reverse proxy
- Container 2: Jenkins running behind NGinX
- Container 3: Data Container to persist Jenkins configurations

# Instructions
- Run Docker-Compose commands:
  - docker-compose build: build dockerfiles.
  - docker-compose up -d: start new docker containers.
  - docker-compose stop: stop running docker containers.
  - docker-compose start: start docker containers.
  - docker-compose down: stop and remove containers.
- After start, point your browser to: http://<yourdockerhostip>  
