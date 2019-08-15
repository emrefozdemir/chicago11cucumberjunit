package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Config;
import utilities.Driver;

public class HRApp_Steps {

    @Given("I am on DepEmpPage")
    public void i_am_on_DepEmpPage() {
        Driver.getDriver().get(Config.getProperty("hrappURL"));
    }

    @When("I search for departmentid {int}")
    public void i_search_for_departmentid(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I query database with sql {string}")
    public void i_query_database_with_sql(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("UI data and Database data must match")
    public void ui_data_and_Database_data_must_match() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
