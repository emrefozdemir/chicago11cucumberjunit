package apitests;

import apiModels.*;
import apiModels.Company;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import utilities.APIRunner;

import java.io.IOException;

public class PostAPI {
    Company company = new Company();
    Contact contact = new Contact();

    @Test
    public void postStudent() {
        Student student = new Student();
        student.setBatch(10);
        student.setFirstName("Better");
        student.setId(1234);
        student.setLastName("Saul");
        student.setCompany(company);
        student.setContact(contact);

        //manually we're using POSTMAN to post a new student but with JAVA code we can use below code it's exactly same thing.
        Response response = RestAssured.given().contentType(ContentType.JSON)
                .body(student).when().post("http://cybertekchicago.com/student/create");
        System.out.println(response.statusCode());
        System.out.println(response.asString());

    }

    @Test
    public void customSingleStudent() throws IOException {
        Response response = RestAssured.get("http://cybertekchicago.com/student/1512");
        ObjectMapper mapper = new ObjectMapper(); // this class is coming from Jackson library
        CustomResponse cr = mapper.readValue(response.asString(), CustomResponse.class);
        System.out.println(cr.getFirstName());
        System.out.println(cr.getContact().getEmailAddress());
    }

    @Test
    public void listOfInstructors() throws IOException {
        Response response = RestAssured.get("http://cybertekchicago.com/instructor/all");//this class is coming from RestAssured library
        System.out.println(response.statusCode());
        ObjectMapper mapper = new ObjectMapper(); // this class is coming from Jackson library
        // this line is converting the response from Json format to Java Object format
        CustomResponse cr = mapper.readValue(response.asString(), CustomResponse.class);

        System.out.println(cr.getInstructors().get(0).getSubject());

        for(Instructor instructor : cr.getInstructors()){
            if(instructor.getSubject() == null){
                System.out.println("First name: " + instructor.getFirstName());
                System.out.println("Last name: " + instructor.getLastName());
                System.out.println("-----------------------------");
            }
        }

//        for(int i = 0; i< cr.getInstructors().size(); i++){
//            if(cr.getInstructors().get(i).getSubject() == null){
//                System.out.println(cr.getInstructors().get(i).getFirstName() + cr.getInstructors().get(i).getLastName());
//            }
//        }

    }

    @Test
    public void studentLocation() throws IOException {
        Response response = RestAssured.get("http://cybertekchicago.com/student/all");
        ObjectMapper mapper = new ObjectMapper();
        CustomResponse cr = mapper.readValue(response.asString(), CustomResponse.class);
        System.out.println(cr.getStudents().size());
        int counter = 0;
        for(Student student: cr.getStudents()){
            /*
            TASC:
            Find students who live in Chicago and print first and last name
            */
            if(student.getCompany().getAddress().getCity().equalsIgnoreCase("Chicago")){
                System.out.println("First Name: " + student.getFirstName());
                System.out.println("Last Name: " + student.getLastName());
                System.out.println("---------------------");
                counter++;
            }
        }
        System.out.println("Total: " + counter);
    }

    @Test
    public void utilTest(){
        APIRunner.runGET("http://cybertekchicago.com/student/1512");
        String companyLocation = APIRunner.getResponse().getCompany().getAddress().getCity();
        System.out.println(companyLocation);
    }

    @Test
    public void batch7(){
        APIRunner.runGET("http://cybertekchicago.com/student/all");

        int counter = 0;
        for(Student student: APIRunner.getResponse().getStudents()){
            if(student.getBatch() == 7) {
                System.out.println(student.getFirstName());
                counter++;
            }
        }
        System.out.println("Total batch 7 students: " + counter);

      // print out first name and last name who work for google

        for(Student student: APIRunner.getResponse().getStudents()){
            if(student.getCompany().getCompanyName() != null && student.getCompany().getCompanyName().equalsIgnoreCase("google")){
                //some people's company name is empty
                System.out.println("First Name: " + student.getFirstName());
                System.out.println("Last Name: " + student.getLastName());

            }
        }


    }
}





















