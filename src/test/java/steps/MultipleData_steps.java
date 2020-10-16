package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.Driver;
import java.util.Map;

public class MultipleData_steps {
    @Given("User goes to Amazon")
    public void user_goes_to_Amazon() {
        Driver.getDriver().get("https://www.amazon.com/");
    }

    @Given("User verifies following search departments")
    public void user_verifies_following_search_departments(Map<String,String> options) {
        System.out.println(options);
        System.out.println(options.get("Computer"));
    }

    @Then("User closes the amazon")
    public void user_closes_the_amazon() {
//       Driver.quitDriver();
    }

    @io.cucumber.java.en.Given("a user on this page")
    public void aUserOnThisPage() {

    }
}
