FROM tmb132/java
WORKDIR /myapp/sas
RUN apt-get install -y python3.8 python3-pip xterm openjdk-8-jre-headless xfonts-base xfonts-100dpi xfonts-75dpi xfonts-cyrillic xfonts-encodings xfonts-scalable xfonts-utils xfonts-efont-unicode
RUN pip3 install saspy
RUN pip3 install flask
COPY . /myapp/sas
RUN mv .authinfo /root
RUN mv sascfg_personal.py /usr/local/lib/python3.8/dist-packages/saspy
ENV DISPLAY=192.168.1.162:0.0
RUN ln -s /usr/bin/python3 /usr/bin/python
ENTRYPOINT ["python3"]
CMD ["sas.py"]
