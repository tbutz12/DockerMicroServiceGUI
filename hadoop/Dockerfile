FROM tmb132/git
WORKDIR /app/hadoop
RUN git clone https://github.com/big-data-europe/docker-hadoop
COPY . /app/git
RUN cd docker-hadoop
ENTRYPOINT ["python3"]
CMD ["git.py"]
