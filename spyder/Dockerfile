FROM tmb132/spyder
WORKDIR /app/spyder
RUN pip3 install flask
COPY . /app/spyder

ENTRYPOINT ["python3"]
CMD ["spyder.py"]
