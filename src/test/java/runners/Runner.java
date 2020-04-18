package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json", "html:target/cucumber"},
        features = {"src/test/resources/features", "src/test/resources/hrapp_feature"},
        glue = "steps",
        tags = "@zebraEndToEndTesting",
        dryRun = false

        // running the scenario and executing the steps
)

public class Runner {

}

