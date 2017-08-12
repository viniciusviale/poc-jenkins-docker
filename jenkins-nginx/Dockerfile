FROM nginx:latest
MAINTAINER Vinicius Viale Pinheiro

# Remove default files we don't need
RUN rm /etc/nginx/conf.d/default.conf

# Add default configuration
COPY conf/jenkins.conf /etc/nginx/conf.d/jenkins.conf
COPY conf/nginx.conf /etc/nginx/nginx.conf

EXPOSE 80

CMD ["nginx"]
