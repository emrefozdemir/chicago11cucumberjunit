package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HRAppDeptEmpPage;
import utilities.Config;
import utilities.DBType;
import utilities.DBUtility;
import utilities.Driver;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HRApp_Steps {
    private HRAppDeptEmpPage deptEmpPage = new HRAppDeptEmpPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
    private Map<String,String> UIDepartmentData;
    private Map<String,Object> DBDepartmentData;


    @Given("I am on DepEmpPage")
    public void i_am_on_DepEmpPage() {
        Driver.getDriver().get(Config.getProperty("hrappURL"));
    }

    @When("I search for departmentid {int}")
    public void i_search_for_departmentid(Integer deptID) throws InterruptedException {

        deptEmpPage.searchForDepartment(deptID);

       // add UI data to hashmap
        UIDepartmentData.put("DEPARTMENT_NAME", deptEmpPage.departmentName.getText());
        UIDepartmentData.put("MANAGER_ID", deptEmpPage.managerID.getText());
        UIDepartmentData.put("LOCATION_ID", deptEmpPage.locationID.getText());

    }


    @When("I query database with sql {string}")
    public void i_query_database_with_sql(String sql) throws SQLException {
        DBUtility.establishConnection(DBType.ORACLE);
        List<Map<String,Object>> DBDataList = DBUtility.runSQLQuery(sql);
        DBDepartmentData = DBDataList.get(0); // i didn't get this part
        DBUtility.closeConnections();
    }

    @When("I search for email {string} to see firstname and lastname")
    public void i_search_for_email_to_see_firstname_and_lastname(String emailId) {
        deptEmpPage.email.clear();
        deptEmpPage.email.sendKeys(emailId);
        deptEmpPage.FindDetails.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pt1:r1:0:ot1")));
        UIDepartmentData = new HashMap<>();

        UIDepartmentData.put("FIRST_NAME", deptEmpPage.firstName.getText());
        UIDepartmentData.put("LAST_NAME", deptEmpPage.lastName.getText());

    }

    @When("I search for department id {int} and get number of employees")
    public void i_search_for_department_id_and_get_number_of_employees(Integer deptID) throws InterruptedException {
        deptEmpPage.searchForDepartment(deptID);
        deptEmpPage.detach.click();
        Thread.sleep(3000);
        UIDepartmentData = new HashMap<>();
        UIDepartmentData.put("EMPLOYEES_COUNT", String.valueOf(deptEmpPage.employeesCOunt.size()));
        

    }

    @Then("UI data and Database data must match")
    public void ui_data_and_Database_data_must_match() {
        for(String key: DBDepartmentData.keySet()){
            Assert.assertEquals(UIDepartmentData.get(key), String.valueOf(DBDepartmentData.get(key)));
        }
//        Assert.assertEquals(UIDepartmentData,DBDepartmentData);
//        Assert.assertEquals(UIDepartmentData.get("DEPARTMENT_NAME"),DBDepartmentData.get("DEPARTMENT_NAME"));
//        Assert.assertEquals(UIDepartmentData.get("LOCATION_ID"),String.valueOf(DBDepartmentData.get("LOCATION_ID")));
//        Assert.assertEquals(UIDepartmentData.get("MANAGER_ID"), String.valueOf(DBDepartmentData.get("MANAGER_ID")));
    }
}
