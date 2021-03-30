FROM ubuntu:latest
COPY . /usr/myapp/python
WORKDIR /usr/myapp/python
RUN apt-get update -y
RUN apt-get install -y python
USER root
RUN groupadd -g 999 application && \
useradd -r -u 999 -g application application
USER application
CMD [ "python", "spyder_desktop.py", "-p" ]
