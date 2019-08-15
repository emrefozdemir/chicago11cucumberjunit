package steps;

import cucumber.api.java.af.En;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

import javax.swing.*;


public class Amazon_Steps {

    @Then("User should see Amazon in title")
    public void user_should_see_Amazon_in_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitleContains = "Amazon";

        Assert.assertTrue(actualTitle.contains(expectedTitleContains));


    }

    @When("User is on Amazon application")
    public void user_is_on_Amazon_application() {
        Driver.getDriver().get("https://www.amazon.com/");
    }


}
