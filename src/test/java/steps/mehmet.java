package steps;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Driver;

public class mehmet {

    public static void main(String[] args) {
        try{
            System.out.println("str".charAt(5));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void practice(){
        Driver.getDriver().get("https://www.google.com/");
        System.out.println(Driver.getDriver().getTitle());
        System.out.println(Driver.getDriver().getCurrentUrl());

        Driver.getDriver().findElement(By.name("q")).sendKeys();


    }
}
