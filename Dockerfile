FROM java:8
COPY . /user/src/myapp
WORKDIR /user/src/myapp
RUN javac gui.java
CMD ["java", "gui"]


FROM consol/ubuntu-xfce-vnc
USER root
# conda install requires bzip
RUN apt-get update && apt-get install -y python3-pip python3-dev python-virtualenv bzip2 g++ git sudo
RUN apt-get install -y xfce4-terminal software-properties-common python-numpy
# browsers
RUN rm /usr/share/xfce4/helpers/debian-sensible-browser.desktop
RUN add-apt-repository --yes ppa:jonathonf/firefox-esr && apt-get update
RUN apt-get remove -y --purge firefox && apt-get install -y firefox-esr

FROM python:3
WORKDIR /usr/src/app
COPY requirements.txt ./
RUN pip install --no-cache-dir --upgrade pip && \
    pip install --no-cache-dir -r requirements.txt
COPY . .
