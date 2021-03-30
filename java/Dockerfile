FROM ubuntu:20.04
EXPOSE 9990 9990
COPY . /usr/myapp/java
WORKDIR /usr/myapp/java
RUN apt update && apt install -y openjdk-8-jre openjdk-8-jdk firefox
RUN javac gui.java
CMD ["java", "gui"]
