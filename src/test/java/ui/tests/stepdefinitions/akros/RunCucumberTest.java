package ui.tests.stepdefinitions.akros;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        features = "src/test/java/ui/tests/features/akros")
public class RunCucumberTest {
}
