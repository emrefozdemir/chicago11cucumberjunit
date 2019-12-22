package APItestingByHamza;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import org.openqa.selenium.Keys;

import utilities.Driver;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class APITesting{

    // Authentication --> who you are // token accessToken
    // Authorization --> what you can do? what are your proviliges?

    @Test
    public void testToken(){
        RestAssured.baseURI = "https://cybertek-reservation-api-qa.herokuapp.com/";

        Response response = given().log().all().
                param("email","teacherva5@gmail.com").
                param("password","maxpayne").
                when().get("/sign");

        response.prettyPrint();
        response.then().assertThat().statusCode(200).contentType(ContentType.JSON);

        String accessToken = response.jsonPath().getString("accessToken");
        System.out.println(accessToken);

        Response response1 = given().header("Authorization", accessToken).
                when().get("api/campuses");


    }

    @Test
    public void testF1API(){

        RestAssured.baseURI = "http://ergast.com/api/f1/2016/circuits.json";

        given().
                when().get().
                then().assertThat().body("MRData.CircuitTable.Circuits.circuitId", hasSize(21));

        Response response = given().
                when().get();
        response.prettyPrint();



        String str = response.jsonPath().getString("MRData.CircuitTable.Circuits[0].Location.country");
        System.out.println(str);

        assertThat(str, is("Australia"));

        List amountOfCircuitId = response.jsonPath().getList("MRData.CircuitTable.Circuits.circuitId");

        System.out.println("Size = " + amountOfCircuitId.size());


    }

    @Test
    public void GsonVsJackson() throws JsonProcessingException {

        String combo = Keys.chord(Keys.CONTROL, Keys.ENTER);

        Gson gson = new Gson();

        Response response = given().when().get("https://uinames.com/api");

        response.prettyPrint();

        Person person1 = gson.fromJson(response.asString(), Person.class);

        ObjectMapper objectMapper = new ObjectMapper();

//        Person person2 = objectMapper.readValue(response.asString(), Person.class);
        String jsonFormat = objectMapper.writeValueAsString(person1);


        System.out.println(person1);
//        System.out.println(person2);

//        syntax wise different between queryParameter vs pathParameter
//        queryParameter --> it has in url ?(question mark) key and value
//        exp: https://uinames.com/api/?amount=5&region=Turkey
//        pathParameter --> {something}

    }
    @Test
    public void exp(){
        Map<String,Object> map = new HashMap<>();

        map.put("a", "123");
        map.put("b", "313");

        Set<String> setKeys = map.keySet();
        for(String str: setKeys){
            map.get(str);
        }

        Set<Map.Entry<String, Object>> setOfValues = map.entrySet();

        for(Map.Entry<String, Object> map1: setOfValues){
            System.out.println(map1.getKey() + " " +  map1.getValue());
        }


        Set<String> pages = Driver.getDriver().getWindowHandles();
        System.out.println(pages.size());

        Iterator<String> it = pages.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
