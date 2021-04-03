from flask import Flask
from flask import request
import subprocess
app = Flask(__name__)

@app.route('/')
def start():
    subprocess.run(['xterm', '-hold', '-e', 'bash', '-c', 'pyspark'])
    return "success"

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=4040)
