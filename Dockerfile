FROM java:8
COPY . /user/src/myapp
WORKDIR /user/src/myapp
RUN javac gui.java
CMD ["java", "gui"]
