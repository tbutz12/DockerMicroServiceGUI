from flask import Flask
from flask import request
from PyQt5 import sip
import subprocess
app = Flask(__name__)

@app.route('/')
def start():
    subprocess.run(['orange-canvas'])
    return "success"

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=6008)
