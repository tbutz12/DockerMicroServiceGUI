from flask import Flask
from flask import request
import subprocess
app = Flask(__name__)

@app.route('/')
def start():
    subprocess.run(['xterm', '-hold', '-e', 'bash', '-c', 'service docker start && docker run -it tensorflow/tensorflow'])
    return "success"

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=6002)
