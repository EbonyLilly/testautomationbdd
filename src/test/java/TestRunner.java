import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)                    // Test runner specifier
@CucumberOptions(
        features = {"features"},             // Telling the cucumber where the feature files are located
        glue = {"stepdefinitions"},         // Telling the cucumber where the step definitions are
        plugin = {"json:report/json/cucumber.json"}       )
public class TestRunner {
}
