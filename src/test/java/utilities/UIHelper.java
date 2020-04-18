package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UIHelper {

    public static void selectRadioButton(String input){
        WebElement radioButtonToCHoose = Driver.getDriver().findElement(By.xpath("//span[text()='" + input + "']"));
        System.out.println(radioButtonToCHoose.getText());
        radioButtonToCHoose.click();
    }

}
