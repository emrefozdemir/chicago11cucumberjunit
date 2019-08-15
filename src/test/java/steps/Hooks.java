package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before(order = 1)
    public void setup(Scenario scenario){
//        WebDriver driver = Driver.getDriver();
//        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        Driver.quitDriver();
    }

}
