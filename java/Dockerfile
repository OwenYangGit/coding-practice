FROM maven:3.6.1-jdk-8

RUN curl -fsSL https://code-server.dev/install.sh | sh

CMD code-server --bind-addr 0.0.0.0:8080 --auth none
