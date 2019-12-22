package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class MyMethods {

    public void hiddenText(){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        String text = "return document.getElementById(\"package-origin-hp-package\").value;";
        String result = (String)js.executeScript(text);
        System.out.println(result);
    }

    public void openNewTab(){
        String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
    }

}
