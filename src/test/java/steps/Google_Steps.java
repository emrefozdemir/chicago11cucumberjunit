package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;


public class Google_Steps {

    @When("User is on Google search page")
    public void user_is_on_Google_search_page() {
       Driver.getDriver().get("https://www.google.com/");
    }

    @When("User searches for apples")
    public void user_searches_for_apples() throws InterruptedException {
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys("apples" + Keys.ENTER);
    }

    @Then("User should see apples inside of the title")
    public void user_should_see_apples_inside_of_the_title() throws InterruptedException {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "apple";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("User searches for a word {string}")
    public void user_searches_for_a_word(String word) {
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(word + Keys.ENTER);

    }

    @Then("User should see a word {string} inside of the title")
    public void user_should_see_a_word_inside_of_the_title(String word) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = word;
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Given("User test with words {string} {string} {string}")
    public void user_test_with_words(String string, String string2, String string3) {

    }

    @Then("User checks numbers {int} and {int}")
    public void user_checks_numbers_and(Integer int1, Integer int2) {

    }
}
