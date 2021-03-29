
FROM java:8
COPY . /usr/myapp/java
WORKDIR /usr/myapp/java
RUN javac gui.java
CMD ["java", "gui"]

FROM debian
RUN apt-get update
RUN apt-get install -qqy x11-apps
RUN export DISPLAY=:0
ENV DISPLAY :0
CMD xeyes
