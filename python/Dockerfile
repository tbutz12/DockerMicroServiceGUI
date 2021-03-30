FROM python:3
COPY . /usr/myapp/pip
WORKDIR /usr/myapp/pip
RUN apt-get install -y build-essential python3.6 python3-pip python3-dev
RUN apt install -y virtualenv build-essential python3-dev
RUN pip3 -q install pip --upgrade
RUN virtualenv --python=python3 --system-site-packages orange3venv
RUN source orange3venv/bin/activate
RUN pip install orange3
