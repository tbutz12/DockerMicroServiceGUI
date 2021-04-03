FROM tmb132/spyder
WORKDIR /myapp/name_node
COPY . /myapp/name_node
ENV DEBIAN_FRONTEND=noninteractive
RUN apt-get update && apt-get install -y python3-pip python3.8 xterm
RUN apt-get install -y curl apt-transport-https ca-certificates software-properties-common xterm sudo xfonts-base xfonts-100dpi xfonts-75dpi xfonts-cyrillic xfonts-encodings xfonts-scalable xfonts-utils xfonts-efont-unicode
RUN curl -fsSL https://download.docker.com/linux/ubuntu/gpg | apt-key add -
RUN add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu focal stable"
RUN apt-get install -y docker-ce
RUN apt-cache policy docker-ce
VOLUME /var/run/docker.sock
RUN pip3 install flask
ENTRYPOINT ["python3"]
CMD ["namenode_run.py"]
