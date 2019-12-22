package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GasMileageCalculatorPage {

    public GasMileageCalculatorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

// all web pages are located

    @FindBy(id = "uscodreading")
    public WebElement currentOdo;

// in pages class i'm locatin my all webelements

    @FindBy(id = "uspodreading")
    public WebElement previousOdo;

    @FindBy(id = "usgasputin")
    public WebElement gasInput;

    @FindBy(xpath = "(//input[@value='Calculate'])[1]")
    public WebElement calculateButton;

    @FindBy(xpath = "//b[contains(text(), 'mpg')]")
    public WebElement resultInGas;


}