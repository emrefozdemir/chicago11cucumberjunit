package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.WikipediaHomePage;
import utilities.Config;
import utilities.Driver;

public class Wikipedia_Steps {
    WikipediaHomePage homePage = new WikipediaHomePage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_Wikipedia_home_page() {
        Driver.getDriver().get(Config.getProperty("wikipediaURL"));
    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String string) {
        homePage.searchBox.sendKeys(string);
    }

    @When("User click search button")
    public void user_click_search_button() {
        homePage.searchButton.click();
    }

    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

}