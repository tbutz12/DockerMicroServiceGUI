FROM tmb132/spyder
RUN apt-get update && apt-get install -y python3.8 python3-pip xterm default-jdk
RUN pip3 install pyspark flask
COPY . /app/spark
WORKDIR /app/spark
RUN mkdir /input
RUN mkdir /output
RUN tr -dc "A-Za-z 0-9" < /dev/urandom | fold -w100|head -n 100000 > /input/bigfile.txt
ENTRYPOINT ["python3"]
CMD ["spark.py"]
