package fakeAPI;

import java.util.List;

public class API {

    // User creation API
    // We use HTTP POST method to achieve this
    // Requirement:
    // 1. url+resourse 2. request body
    // Imagine url+resourse for this API is "api.test.com/user/create"
    // Request body MUST be as following:
    // user must have name, user must have username
    // user must have password.

    public static String createUser(String url, User user){
        String expectedURL = "api.test.com/user/create";
        if(!url.equals(expectedURL)){
            return "404 - Resourse Not Found";
        }
        if(user.name == null || user.username == null || user.password == null){
            return "400 - Bad Request";
        }

        DB.getUsers("hello321").add(user);
        return "201 - User Created";

    }

    public static List<User> getUsers(String url){

        String expectedURL = "api.test.com/user/all";
        if(!url.equals(expectedURL)) {
            System.out.println("404 - Resourse Not Found");
            return null;
        }
        System.out.println("200 - OK");
        return DB.getUsers("hello321");
    }
}
