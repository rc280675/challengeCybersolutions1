<h1 align="center"> challengeCybersolutionsProject </h1>
This project was created to meet a specification of the candidate's knowledge evaluation process to work at cybersolutions.com.br. It was written in an architecture that resembles my writing practice, focused on good coding practices and with attention to easy maintainability.

## Guidelines
- Cloning, when cloning the project remember to update the dependencies
- Writing, this code was writting with gherkin syntaxe
- Architecture:

|_ Maps - where all the webelements of the code are identified

|_ Pages - where are actions

|_ Runner - Java classe in charge for execute the test, where specific settings are specified

|_ Steps - where we have details of gherkin

|_ Resources

|___ features - also know as "BDD"

- Tag Strategy, each scenario receive one different tag and all received a mesma tag "Challenger", this way is possible execute all scenarios or only one
- Execution, in order to give more performance to web tests, it is a good practice to run it in headless mode, that is, without calling the browser driver

## Report
This code was written with a library that allows you to extract test execution results for presentation, just run the command line below:

`mvn test -Dcucumber.filter.tags="@Challenger" && mvn cluecumber-report:reporting`

The file will always be generated in the path: report path: **target/report/**

## Author
[<sub>Rodrigo Caetano dos Santos</sub>](https://www.linkedin.com/in/rodrigo-caetano-dos-santos-15853ba9/)
