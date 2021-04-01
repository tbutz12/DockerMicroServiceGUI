FROM tmb132/spyder
WORKDIR /app/git
RUN pip3 install flask
RUN apt-get install -y xterm git
COPY . /app/git
ENTRYPOINT ["python3"]
CMD ["git.py"]
