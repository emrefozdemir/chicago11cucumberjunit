package steps;

import cucumber.api.Scenario;
import io.cucumber.java.Before;
import org.apache.http.util.Asserts;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.APIRunner;
import utilities.Driver;


public class Hooks {

    @Before(order = 1)
    public void setup(Scenario scenario){
//        Driver.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario
                                     scenario){
    //scenario class
        if(scenario.isFailed() && Driver.getDriverReference() != null){
            final byte[] screenshot = ((TakesScreenshot)Driver.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            //this is when it fails
        }

        if(scenario.isFailed() && APIRunner.getCr() != null){
            scenario.write(APIRunner.getResponse().getJsonResponse());
        }






    }

}
