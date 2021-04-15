FROM bde2020/hadoop-base:2.0.0-hadoop3.2.1-java8
RUN apt-get install
MAINTAINER Ivan Ermilov <ivan.s.ermilov@gmail.com>
HEALTHCHECK CMD curl -f http://localhost:9870/ || exit 1
#ADD mapreduce.jar /mapreduce.jar
COPY mapreduce.jar /mapreduce.jar
ENV HDFS_CONF_dfs_namenode_name_dir=file:///hadoop/dfs/name
RUN mkdir -p /hadoop/dfs/name
RUN mkdir input
VOLUME /hadoop/dfs/name

ADD run.sh /run.sh
RUN chmod a+x /run.sh

EXPOSE 9870

CMD ["/run.sh", "cd .."]
