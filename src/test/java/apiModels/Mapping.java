package apiModels;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.IOException;

public class Mapping {

    @Test
    public void pojoMapping() throws IOException {
        String json = "{\n" +
                "    \"id\": 1506,\n" +
                "    \"firstName\": \"Bill\",\n" +
                "    \"lastName\": \"Geyts\",\n" +
                "    \"batch\": 10,\n" +
                "    \"contact\": {\n" +
                "        \"contactId\": 1526,\n" +
                "        \"phone\": \"123-456-789\",\n" +
                "        \"email\": \"google@gmail.com\"\n" +
                "    },\n" +
                "    \"company\": {\n" +
                "        \"companyId\": 1506,\n" +
                "        \"companyName\": \"Google\",\n" +
                "        \"title\": \"APllication\",\n" +
                "        \"startDate\": \"01/12/2018\",\n" +
                "        \"address\": {\n" +
                "            \"addressId\": 1506,\n" +
                "            \"street\": \"ul Tolebi\",\n" +
                "            \"city\": \"Tashkent\",\n" +
                "            \"state\": \"IL\",\n" +
                "            \"zipCode\": 60015\n" +
                "        }\n" +
                "    }\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();
        Student instructor = mapper.readValue(json, Student.class);
        System.out.println(instructor.getCompany().getAddress().getCity());


    }

    Company company = new Company();
    Contact contact = new Contact();

    @Test
    public void objectToJson() throws Exception {
        Student student = new Student();
        student.setBatch(10);
        student.setFirstName("emre");
        student.setId(1234);
        student.setLastName("ozdemir");
        student.setCompany(company);
        student.setContact(contact);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(student);
        System.out.println(json);


    }

    @Test
    public void singleStudentHit() throws IOException {
        Response response = RestAssured.get("http://cybertekchicago.com/student/1383");
        System.out.println(response.asString());
        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(response.asString(),Student.class);
        System.out.println(student.getFirstName());
        System.out.println(student.getContact().getEmailAddress());
    }

}
