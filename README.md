UI test case automation
==============================================
- This framework allows you to automate UI cases

## Requirements
- [Maven](https://maven.apache.org/download.cgi)
- [Java 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

## Features

1. `helpers` package acts as a wrapper over selenium to handle sync issues, and simply user events
2. `listeners` package defines framework level listeners, especially for report logging
3. `readers` package allows user to read from different file formats
4. `utils` package comes handy when you test case verification is not only limited to UI
5. `webdriver` package manages webdriver instance with ease along with listeners
6. `rest` package provides helper methods for rest api automation
7. `drivers` directory contains various browser driver executables, these needs to be updated to support latest browser version
8. `pageobjects` package contains page objects for web application
9. `runners` package defines cucumber runner which executes test cases
10. `stepdefs` package defines underlying code for steps mentioned in feature files
11. `features` directory contains test case feature files
12. `config.properties` allows you to specify test execution configuration, don't use it to provide test data

## How to use it?
1. Clone this repo using `git clone` command
2. Goto project directory

### Execute test cases
1. Run command `mvn clean test` to execute test cases
2. Run command `mvn allure:report` to generate HTML report

## Reporting and logs
- `target/screenshots` directory: contains browser screenshots in case of test case failure
- `target/automation.out` file: contains detailed log for debugging purpose
- `target/site/allure-maven-plugin/index.html` directory: contains execution report in HTML format

## Author
- [Vikas Sanap](https://www.linkedin.com/in/vikassanap/)