package com.company;

public class Profile extends User{

    private  String FirstName;
    private  String LastName;
    private  int age;
    private  User user;

    public Profile(String login, String password, String role) {
        super(login, password, role);
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
    }


    public String getFirstName() { return FirstName; }

    public void setFirstName(String firstName) { FirstName = firstName; }

    public String getLastName() { return LastName; }

    public void setLastName(String lastName) { LastName = lastName; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

}
