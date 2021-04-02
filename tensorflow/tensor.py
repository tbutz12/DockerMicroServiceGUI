from flask import Flask
from flask import request
import subprocess
app = Flask(__name__)

@app.route('/')
def start():
    var = "curl -d '{\"instances\": [1.0, 2.0, 5.0]}' \
        -X POST http://localhost:8501/v1/models/half_plus_two:predict "
    subprocess.run(['xterm', 'hold', '-e', 'bash', '-c', var + '-X POST http://localhost:8501/v1/models/half_plus_two:predict'])
    #subprocess.run(['xterm');
    return "success"

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=8501)
