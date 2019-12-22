package steps.apiSteps;

import apiModels.Student;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.APIRunner;

public class StudentTitle_Steps {

    @When("users hits list of students API with {string}")
    public void users_hits_list_of_students_API_with(String uri) {
        APIRunner.runGET(uri);
    }

    @When("user verifies eachs students title to be at least two letters")
    public void user_verifies_eachs_students_title_to_be_at_least_two_letters() {

        int counter = 0;
        for (Student student : APIRunner.getResponse().getStudents()) {
            String title = student.getCompany().getTitle();
            System.out.println(title);
            Assert.assertTrue("Student title is failing at index: " + counter, title.length() > 2);
            counter++;
        }
    }


}
