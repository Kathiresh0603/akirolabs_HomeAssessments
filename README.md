# Akirolabs - Home Assessment

## Selenium + TestNG + Java + Cucumber + Maven Test Framework

This framework is designed for automated end-to-end testing of web applications using Selenium, TestNG, Java, and Cucumber. It includes tests for performing a Google search and verifying the search results.
 

### Prerequisites

Before running the tests, make sure you have the following prerequisites installed:

Java Development Kit (JDK)

Maven

Chrome (make sure the driver is available in the PATH)

## Prerequisites

The framework follows the Page Object Model (POM) design pattern, which separates the UI locators and interaction from the test logic. The key components of the framework include:

### Feature files: 
Located in the src/test/resources/features directory, these files define the behavior of the tests using Gherkin syntax.

### Step Definitions: 
Implemented in the com.akirolabs.stepdefinitions package, these Java classes interpret Gherkin steps and interact with the page objects.

### Page Objects: 
Located in the com.akirolabs.pages package, these classes encapsulate the web page's structure and interactions.

### Runner Class: 
The RunnerClass in the com.akirolabs.runner package configures and runs the Cucumber tests.

### Test Data: 
config.properties located in the src/test/resources directory to configure the search phrase to be use for the Google Search.

The above package structure is an idea to show how automation tests can be written implementing 
screenplay design pattern and SOLID (Single Responsibility , Open/Closed, Liskov Substitution, 
Interface Segregation, Depedency Injection) principles together using Serenity BDD framework.

### Running the Tests
To run the tests manually, follow these steps:

1. Clone the repository to the local machine from the public repository link

    
    git clone https://github.com/Kathiresh0603/akirolabs_Assessment.git

2. Navigate to the project's root directory.


    cd <project_directory>

3. Execute the tests using Maven:


    mvn clean test

### Customizing Test Data

Can customize and modify the search phrase in the Config.properties. 


### Additional Notes

1. The framework uses TestNG as the testing framework and Cucumber for writing and executing feature files.
2. WebDriver is managed using the DriverManager class to ensure proper setup and teardown.
3. The start.sh and start.bat scripts in the repository root can be used to run the tests easily on different operating systems.