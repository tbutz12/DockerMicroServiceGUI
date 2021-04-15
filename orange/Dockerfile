FROM tmb132/spyder
WORKDIR /app/orange
RUN pip3 install flask
RUN pip3 install orange3
RUN pip3 uninstall -y PyQt5
RUN pip3 install PyQt5==5.13
RUN pip3 install PyQt5-sip
COPY . /app/orange
ENTRYPOINT ["python3"]
CMD ["orange.py"]
