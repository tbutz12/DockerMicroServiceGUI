FROM tmb132/spyder
WORKDIR /app/tensorflow
RUN apt-get update && apt-get install -y python3 python3-pip xterm curl
RUN pip3 install flask
COPY . /app/tensorflow
ENTRYPOINT ["python3"]
CMD ["tensorflow.py"]
