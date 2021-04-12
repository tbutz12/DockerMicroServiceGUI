# Java GUI for Docker Microservices

## Configure Environment Variables

To started, set the environment variable. The file `.env` at the base of the project folder will need changed to your environment. **THIS MUST BE DONE TO SEE THE GUI**

```
  For example: DISPLAY=127.0.0.0.1
               DISPLAY={YourDisplayEnvironment}
```
**Ensure you have some type of server running to execute the graphics, such as Xming or XLaunch if you are on Windows or Mac OSX**

To test that this was set correctly, you can run:
```
  docker-compose config
```
## Quick Start

To compile and start the docker file:
```
  docker-compose up -d
```
## SonarQube

To get started in SonarQube:
```
  The login is as follows:

  Username = admin
  Password = admin
```

## IBM SAS

```
  There is a pre-configured file that is ran when starting IBM SAS.
  However run your own example, by going into a python terminal by:
  python3
  [SAS CODE]
```
This code will be executed with a default login that I have created for testing purposes. It is ran by IBM SAS Educational Edition, and is free for use. For more information, a web page will be launched after closing the terminal where this is hosted.

## Apache Hadoop

For the Hadoop Microservice, there is a .jar file example already pre-loaded. You can test run this by:
```
hadoop jar hadoop-mapreduce-examples-2.7.1-sources.jar org.apache.hadoop.examples.WordCount input path/to/your/output
hdfs dfs -cat path/to/your/output/part-r-00000
```

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
