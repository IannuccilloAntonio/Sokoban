FROM openjdk:11
MAINTAINER  Antonio Iannuccillo <iannuccillo.antonio99@gmai.com>


ENV JAVA_VER 8

RUN apt-get -y update
RUN apt-get -y upgrade

RUN apt-get install unzip
RUN apt-get install -y libxrender1 libxtst6 libxi6



ENTRYPOINT ["java","-jar","build/Sokoban-1.0.jar"]
CMD ["-start"]
