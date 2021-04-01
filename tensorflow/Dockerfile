FROM tmb132/git
WORKDIR /app/tensorflow
RUN pip3 install tensorflow
COPY . /app/tensorflow
ENTRYPOINT ["python3"]
CMD ["tensorflow.py"]
