package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.theZebraPage;
import utilities.Driver;
import utilities.UIHelper;

import java.util.HashMap;
import java.util.Map;

public class theZebra_Steps {
    theZebraPage zebraPage = new theZebraPage();
    Map<String, String> dataMap = new HashMap<>();

    @When("A user is on Zebra home page")
    public void a_user_is_on_Zebra_home_page() {
        Driver.getDriver().get("https://www.thezebra.com/");
        Driver.getDriver().findElement(By.xpath("(//input[@autocomplete='postal-code'])[1]")).sendKeys("60056");
        Driver.getDriver().findElement(By.xpath("(//span[text()='Start'])[1]")).click();

    }

    @Then("User provides required data for quote")
    public void userProvidesRequiredDataForQuote(Map<String, String> dataMap) {
        System.out.println(dataMap);
        UIHelper.selectRadioButton(dataMap.get("insured"));
        UIHelper.selectRadioButton(dataMap.get("ownOrrent"));
        zebraPage.saveAndContinueBtn.click();
    }
}
