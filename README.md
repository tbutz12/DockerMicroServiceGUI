# Java GUI for Docker Microservices

## Configure Environment Variables

To get started, set the environment variable. The file `.env` at the base of the project folder will need changed to whatever your environment variable is. For Windows, this will typically be your IPv4 Address followed by ":0.0". To find your IP Address, you can run the command:
```
ipconfig
```
After obtaining your IPv4 address, you can modify the .env file to set the DISPLAY variable as so:
```
DISPLAY={YourIPAddress:0.0}
```
**Ensure you have some type of server running to execute the graphics, such as Xming or XLaunch if you are on Windows or Mac OSX**

To test that this was set correctly, run this command and check for a variable called DISPLAY and make sure it is set to what you set it to above:
```
  docker-compose config
```
# Quick Start

To compile and start the docker file:
```
  docker-compose up -d
```

## IBM SAS

```
  There is a python file named 'example.py' inside of this container.
  This file will import saspy, which is used to communicate with
  IBM SAS On Demand Academics. In this example, you will see a basic
  output of data from the configured test case. The file will have
  these contents inside:

  import saspy
  sas = saspy.SASsession(cfgname='oda')
  cars = sas.sasdata("CARS","SASHELP")
  cars.describe()

  To run this example file, type 'python example.py' into the console.
  If you would like to run your own SAS code, this can be done by entering
  the python terminal and executing your code.
```
Upon closing the terminal, you will be redirected to IBM SAS On Demand Academics website from inside of the docker container.

## SonarQube

To get started in SonarQube:
```
  The login is as follows:

  Username = admin
  Password = admin
```
After logging in, you will be prompted to change your password. This can be changed to anything you would like.

## Apache Hadoop

For the Hadoop Microservice, you can run a quick test simply by typing 'hadoop version' into the terminal to see that Hadoop is set up correctly. For a more detailed test, you can run hadoop map reduce by testing an example jar file:
```
hadoop jar mapreduce.jar org.apache.hadoop.examples.WordCount input path/to/your/output
hdfs dfs -cat path/to/your/output/part-r-00000
```
Upon exiting, the overview UI will be displayed to give further analysis of the job completed.

## Apache Spark

For the Spark Microservice, there is a pre-generated big input text file. This file can be run inside the spark terminal by:
```
input_file = sc.textFile("/input/bigfile.txt")
map = input_file.flatMap(lambda line: line.split(" ")).map(lambda word: (word, 1))
counts = map.reduceByKey(lambda a, b: a + b)
counts.saveAsTextFile("path/to/your/output/")
```
To view the results, you can run these commands:
```
f = open('/path/to/your/output/part-00000')
content = f.read()
print(content)
f2 = open('/path/to/your/output/part-00001')
content2 = f2.read()
print(content2)
```

## Exiting the application
When exiting the application, run the command:
```
docker-compose down
```
