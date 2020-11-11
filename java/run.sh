#!/bin/bash
docker run -it --rm --workdir /root/app --name my-java-dev -p 8080:8080 -p 5000:5000 -v $(pwd)/code/:/root/app/ maven:3.6.1-jdk-8 code-server --auth none