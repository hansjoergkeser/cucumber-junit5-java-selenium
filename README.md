# cucumber-junit5-java-selenium

Small basis setup project demonstrating Gherkin scenarios to execute ui tests with Selenium

Run tests in Terminal by command:
mvn clean test -U

or in IntelliJ by right-click RUN on class RunCucumberTest

to test only certain features:
mvn clean test -Dtest=*ecosia.RunCucumberTest

It is recommended to install a plugin in IntelliJ like "Cucumber for Java"