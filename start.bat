@echo off

REM Clean and build the project 
mvn clean install

REM Run your Cucumber tests using TestNG
mvn test