package steps;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Driver;

import java.util.List;
import java.util.Set;

public class mehmet {

    @Test
    public void practice(){
        Driver.getDriver().get("https://www.google.com/");
        System.out.println(Driver.getDriver().getTitle());
        System.out.println(Driver.getDriver().getCurrentUrl());

        Driver.getDriver().findElement(By.name("q")).sendKeys();

        Set<String> names;

        List<String> numbers;


    }
}
