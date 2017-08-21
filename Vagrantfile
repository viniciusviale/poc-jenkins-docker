# -*- mode: ruby -*-
# vi: set ft=ruby :
Vagrant.configure("2") do |config|
    
    config.vm.box = "ubuntu/xenial64"
    # Add forwarded ports docker-compose-ci
    config.vm.network "forwarded_port", guest: 80, host: 80
    config.vm.network "forwarded_port", guest: 50000, host: 50000
    config.vm.network "forwarded_port", guest: 2376, host: 2376

    config.vm.synced_folder ".", "/vagrant", disabled: false

    config.vm.provider "virtualbox" do |v|
      v.memory = 2048
      v.cpus = 2
    end
     
#     config.vm.provision "ansible_local" do |ansible|
#        ansible.galaxy_role_file = "requirements.yml"
#        ansible.galaxy_roles_path = "roles" 
#        ansible.playbook = "docker.yml"
#      end

    config.vm.provision :docker

    # Install the plugin: vagrant plugin install vagrant-docker-compose
    config.vm.provision :docker_compose,
    yml: [
        "/vagrant/docker-compose.yml",
    ],
    rebuild: true,
    run: "always"

end