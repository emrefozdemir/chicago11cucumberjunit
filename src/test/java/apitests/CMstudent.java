package apitests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CMstudent {

    @Test
    public void studentList(){
        Response response = RestAssured.get("http://api.cybertektraining.com/student/all");
        System.out.println(response.statusCode());
//        Assert.assertEquals(response.statusCode(),404);
        System.out.println(response.asString());
    }

    @Test
    public void singleStudent(){
        Response response = RestAssured.get("http://cybertekchicago.com/student/1506");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
//        JsonPath jp = response.jsonPath();
//        int b = jp.get("students.batch");
//        System.out.println(b);
    }

    @Test
    public void instuctorAll(){
        Response response = RestAssured.get("http://cybertekchicago.com/student/all");
//        System.out.println(response.asString());
        JsonPath jp = response.jsonPath();
        List<String> subjects = jp.get("students.firstName");
        System.out.println(subjects.size());

        for(String subject: subjects){
            System.out.println(subject.isEmpty());
        }

    }
}
