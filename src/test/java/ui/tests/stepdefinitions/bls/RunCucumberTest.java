package ui.tests.stepdefinitions.bls;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/ui/tests/features/bls"
        , plugin = {"junit:target/cucumber/result.xml", "json:target/cucumber/calculator.json"}
)
public class RunCucumberTest {
}
