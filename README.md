# BetriebsstellenAPI

Coding challenge. Takes open data from https://download-data.deutschebahn.com/static/datasets/betriebsstellen/DBNetz-Betriebsstellenverzeichnis-Stand2021-10.csv as manually imported .csv file and provides a REST endpoint to retrieve data by location abbreviation. Additionally provides option to view all Betriebsstellen. 

To run, open in e.g. IntelliJ and run main class 'BetriebsstellenApiApplication'.

Connection points e.g. :
- `http://localhost:8080//h2`: database console
- `http://localhost:8080//betriebsstellen`: list of all Betriebsstellen with all details in json format
- `http://localhost:8080//betriebsstellen/{abbrev}`: details of the Betriebsstelle with abbrevation abbrev in json format
- `http://localhost:8080//swagger-ui.html#/`: Swagger UI for prettier API Documentation

Tools & Resources:
- IntelliJ
- Spring Boot (initial project package form https://start.spring.io/, with Maven & Java 18)
  - Dependencies: H2 database, JPA, Swagger
- Udacity Web Development with Java https://www.udacity.com/course/java-developer-nanodegree--nd035

ToDos:
- automatic tests
- improve/automate csv import
- provide more options (different get options, plus post/put/delete etc.)
