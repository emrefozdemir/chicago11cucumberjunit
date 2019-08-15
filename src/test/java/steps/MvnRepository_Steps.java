package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Driver;

public class MvnRepository_Steps {

    @When("User is on mvnrepository page")
    public void user_is_on_mvnrepository_page() {
        Driver.getDriver().get("https://mvnrepository.com/search?q=cucumber+java");
    }

    @Then("User searches for a repository {string}")
    public void user_searches_for_a_repository(String string) {

    }
}
