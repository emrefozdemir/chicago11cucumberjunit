package runners;

import io.cucumber.junit.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber" , "json:target/report.json"},
        features = {"src/test/resources/features", "src/test/resources/hrapp_feature"},
        glue = "steps",
        tags = "@testReport",
        dryRun = false

        // running the scenario and executing the steps
)


public class Runner {

}
