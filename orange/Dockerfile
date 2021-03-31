FROM ubuntu:latest
WORKDIR /app
ADD . /app
ENV DEBIAN_FRONTEND=noninteractive
RUN set -xe \
    && apt-get update \
    && apt-get install -y python3-pip virtualenv build-essential python3-opencv libglib2.0-0 libgl1-mesa-glx ffmpeg libsm6 libxext6 libx11-xcb1 x11-xserver-utils libxkbcommon-x11-0 libxcb-xinerama0
RUN virtualenv --python=python3 --system-site-packages orange3venv
RUN . orange3venv/bin/activate
RUN pip3 install --upgrade pip
RUN pip3 install opencv-python==4.1.2.30
RUN pip3 install orange3
ENV DISPLAY :0
ENTRYPOINT ["/bin/python3", "-m"]
CMD ["Orange.canvas"]
