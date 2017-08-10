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
- [Install](https://github.com/docker/compose/releases) Docker-Compose.
- Download this repository to a local folder in your virtual machine.
- Follow the README files in the POCs folders.
