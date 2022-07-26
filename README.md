# BetriebsstellenAPI

Coding challenge. Takes open data from https://download-data.deutschebahn.com/static/datasets/betriebsstellen/DBNetz-Betriebsstellenverzeichnis-Stand2021-10.csv as manually imported .csv file and provides a REST endpoint to retrieve data by location abbreviation. Additionally provides option to view all Betriebsstellen. 

To run, open in e.g. IntelliJ and run main class 'BetriebsstellenApiApplication'.

Connection points e.g. :
- `http://localhost:8080//h2`: database console
- `http://localhost:8080//betriebsstellen`: list of all Betriebsstellen with all details in json format
- `http://localhost:8080//betriebsstellen/{abbrev}`: details of the Betriebsstelle with abbrevation abbrev in json format
- `http://localhost:8080//swagger-ui.html#/`: Swagger UI for prettier API Documentation

#### Tools & Resources:
- Java 18
- Spring Boot (initial project package form `https://start.spring.io/`, with Maven & Java 18)
  - Dependencies: H2 database, JPA, Swagger
- IntelliJ
- Github
- Udacity Web Development with Java `https://www.udacity.com/course/java-developer-nanodegree--nd035`, `https://gitlab.com/videolearning/udacity-java/-/tree/master/`
- Official documentation (`https://www.h2database.com/html/main.html`, `https://docs.spring.io/spring-boot/docs/2.4.12/reference/html/index.html`, `https://www.jetbrains.com/help/idea/spring-boot.html#spring-boot-endpoints`, ...)
- API from Deutsche Bahn for reference: `https://developer.deutschebahn.com/store/apis/info?name=Betriebsstellen&version=v1&provider=DBOpenData&#!/default/get_betriebsstellen_abbrev`
- Stackoverflow, `www.geeksforgeeks.org`, etc.

##### Remaining ToDos:
- (automatic) testing
- improve/automate csv import
- provide more endpoint options (different get options, plus post/put/delete etc.)
