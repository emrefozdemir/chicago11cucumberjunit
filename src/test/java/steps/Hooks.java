package steps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import io.cucumber.java.After;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.APIRunner;
import utilities.Driver;


public class Hooks {

    @Before
    public void setup(Scenario scenario){
        //Anything that you want to run before each Scenario
//        TempStorage.TempStorageclear();
//        Log.start(scenario.getName());
//        ExtentReport.startTest(scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {
        //scenario class
        if (scenario.isFailed() && Driver.getDriverReference() != null) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            //this is when it fails
        }

        if (scenario.isFailed() && APIRunner.getCr() != null) {
            scenario.write(APIRunner.getResponse().getJsonResponse());
        }

    }

    @After
    public void takesScreenShot(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
                .getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }

}
