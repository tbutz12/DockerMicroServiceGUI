FROM tmb132/java:latest
COPY . /usr/myapp/java
WORKDIR /usr/myapp/java
RUN javac gui.java
RUN unset DISPLAY
CMD ["java", "gui"]
