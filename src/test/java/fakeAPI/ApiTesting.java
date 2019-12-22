package fakeAPI;

import org.junit.Test;

import java.util.List;

public class ApiTesting {
    // User creation API
    // We use HTTP POST method to achieve this
    // Requirement:
    // 1. url+resourse 2. request body
    // Imagine url+resourse for this API is "api.test.com/user/create"
    // Request body MUST be as following:
    // user must have name, user must have username
    // user must have password.

    @Test
    public void api1(){
        User u = new User();
        u.name = "James Bond";
        u.username = "jbond";
        u.password = "JB123";

        String response = API.createUser("api.test.com/user/create", u);
        System.out.println(response);
        DB.getUsers("hello321").get(0).info();

        // API 2:
        // GET HTTP method
        // resourse: /user/all
    }

    @Test
    public void api2(){
        List<User> u = API.getUsers("api.test.com/user/all");
        System.out.println(u.size());
    }

}
