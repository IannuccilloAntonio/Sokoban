FROM openjdk:11
MAINTAINER  Antonio Iannuccillo <iannuccillo.antonio99@gmai.com>


ENV JAVA_VER 8

RUN apt-get -y update
RUN apt-get -y upgrade

RUN apt-get install unzip

RUN apt-get install curl
RUN apt-get install -y libxrender1 libxtst6 libxi6


RUN curl -L -H "Authorization: token {{token}}" \
    https://api.github.com/repos/IannuccilloAntonio/Sokoban/actions/artifacts/36962343/zip \
    --output ./jar-artifact.zip

RUN unzip jar-artifact.zip && rm jar-artifact.zip

CMD ["java", "-jar", "Sokoban-1.0.jar"]