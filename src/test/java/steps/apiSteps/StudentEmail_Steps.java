package steps.apiSteps;

import apiModels.Student;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.APIRunner;

public class StudentEmail_Steps {

    @When("user verifies each students email address to be valid")
    public void user_verifies_each_students_email_address_to_be_valid() {
        int counter = 0;
        for (Student student : APIRunner.getResponse().getStudents()) {
            String email = student.getContact().getEmailAddress();
            System.out.println(email);
            Assert.assertTrue("Student email is failing at index: " + counter, email.contains("@") && email.contains("."));
            counter++;
        }
    }
}
