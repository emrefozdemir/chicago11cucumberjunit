package fakeAPI;

public class User {
    String name;
    String username;
    int age;
    String address;
    String password;

    public void info(){
        System.out.println("Name: " + this.name);
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);

    }
}
