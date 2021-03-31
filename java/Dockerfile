FROM ubuntu:20.04
EXPOSE 9990 9990
COPY . /usr/myapp/java
WORKDIR /usr/myapp/java
ENV DEBIAN_FRONTEND=noninteractive
RUN apt update && apt install -y openjdk-8-jre openjdk-8-jdk firefox virtualenv build-essential python3-dev python3-pip
RUN virtualenv --python=python3 --system-site-packages orange3venv
RUN javac gui.java
RUN . orange3venv/bin/activate
RUN pip3 install orange3
CMD ["java", "gui"]
