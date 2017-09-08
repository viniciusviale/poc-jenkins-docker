# -*- mode: ruby -*-
# vi: set ft=ruby :
Vagrant.configure("2") do |config|
    
    config.vm.box = "ubuntu/xenial64"

    # Add forwarded ports docker-compose
    config.vm.network "forwarded_port", guest: 80, host: 80
    config.vm.network "forwarded_port", guest: 8080, host: 8080
    config.vm.network "forwarded_port", guest: 50000, host: 50000

    config.vm.synced_folder ".", "/vagrant", disabled: false

    config.vm.provider "virtualbox" do |v|
      v.memory = 2048
      v.cpus = 2
    end

    config.vm.provision "ansible_local" do |ansible|
        ansible.galaxy_role_file = "docker/requirements.yml"
        ansible.galaxy_roles_path = "docker/roles" 
        ansible.playbook = "docker/docker.yml"
    end

end