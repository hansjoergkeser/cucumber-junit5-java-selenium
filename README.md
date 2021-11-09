# cucumber-junit5-java-selenium

Small basis setup project demonstrating Gherkin scenarios to execute ui tests with Selenium

Get started:
<br>

- check your chrome browser version and download the suitable driver for local execution
  <br>https://chromedriver.chromium.org/downloads
- store it under src/test/resources
- set driver in class [WebDriverSingleton](src/test/java/ui/driver/WebDriverSingleton.java)

First run of tests in Terminal by command:
<br>
`mvn clean test -U`

or in IntelliJ by right-click RUN on class RunCucumberTest

to test only certain features
<br>
`mvn clean test -Dtest=*ecosia.RunCucumberTest`

It is recommended to install a plugin in IntelliJ like "Cucumber for Java"