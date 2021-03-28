RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y git
    apt-get

FROM python:3
WORKDIR /usr/src/app
RUN pip install --no-cache-dir jupyterlab
COPY . .

FROM java:8
COPY . /user/src/myapp
WORKDIR /user/src/myapp
RUN javac gui.java
CMD ["java", "gui"]

FROM rstudio/r-base:4.0-focal
WORKDIR /usr/src/app
