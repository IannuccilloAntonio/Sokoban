# Sokoban

Project for University exams

run mvn clean package to build

#IMPORTANT!!

1. Use your github token to download the file jar from the API
2. To run and build a docker file you need:
  2.1 To install an X server for Windows, a popular choice is "VcXsrv"
  2.2 To set a DISPLAY variable to DISPLAY=<HOST_IP>:0.0, the value for <HOST_IP> can be found using ipconfig, it's the one tagged vEthernet (WLS)
  2.3 After build run your image with: docker run -e DISPLAY=$DISPLAY <your-image> (or DISPLAY=%DISPLAY%, depending on your command line)
