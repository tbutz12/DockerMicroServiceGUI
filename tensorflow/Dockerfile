FROM tensorflow/serving
RUN apt-get update && apt-get install -y python3 python3-pip xterm
RUN pip3 install flask
COPY . /app/tensor
ENTRYPOINT ["python3"]
CMD ["tensor.py"]
