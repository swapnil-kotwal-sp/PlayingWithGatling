PlayingWithGatling
==================

Here is a Gatling project for Performance testing for login scenario of twitter account. 
This is modularize project to setup large performance testing scala script for [Gatling](https://github.com/gatling/gatling) Open Sourse Stress testing tool.

![alt tag](https://raw.githubusercontent.com/swapnilvkotwal/PlayingWithGatling/gatling_image/Gatling.png)

###### Why Gatling:
1. High Performance.
2. Multi Threading vs (Akka) Actor Model.
3. Synchronous Blocking IOs vs asynchronous Non-blocking IOs Netty.

###### Instructions:
1. Download [Gatling](http://gatling.io/download/)
2. Create csv file with valid credentials, under ```\user-files\data```
3. Copy scala code from ```PlayingWithGatling``` under ```\user-files\simulation\PlayingWithGatling```
4. It consist of basic login into any webapp using csv file.
5. Session management and storing session data.
