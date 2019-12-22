package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.HashMap;
import java.util.List;

public class HRAppDeptEmpPage {

    public HRAppDeptEmpPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "pt1:ot1")
    public WebElement department_ID;

    @FindBy(id = "pt1:ot2")
    public WebElement departmentName;

    @FindBy(id = "pt1:ot3")
    public WebElement managerID;

    @FindBy(id = "pt1:ot4")
    public WebElement locationID;

    @FindBy(id = "pt1:cb3")
    public WebElement Next;

    @FindBy(id = "pt1:r1:0:it1::content")
    public WebElement email;

    @FindBy(id = "pt1:r1:0:cb1")
    public WebElement FindDetails;

    @FindBy(id = "pt1:r1:0:ot1")
    public WebElement firstName;

    @FindBy(id = "pt1:r1:0:ot2")
    public WebElement lastName;

    @FindBy(xpath = "//div[@id='pt1:pc1:t1::db']//tr")
    public List<WebElement> employeesCOunt;

    @FindBy(id = "pt1:pc1:_dchTbr::icon")
    public WebElement detach;

    public void searchForDepartment(int deptId) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        int currentDepId = Integer.parseInt(department_ID.getText());
        while(currentDepId != deptId){
            Next.click();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:ot1")));
            currentDepId = Integer.parseInt(department_ID.getText());
        }
    }



}
