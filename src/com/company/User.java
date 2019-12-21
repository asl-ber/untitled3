package com.company;

import  java.util.Objects;

public class User {

    private String login;
    private String password;
    private String role;

    public User (String login, String password, String role){
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public void setLogin(String login) { this.login = login; }

    public String getLogin() { return login; }

    public void setPassword(String password) { this.password = password; }

    public String getPassword() { return password; }

    public void setRole(String role) { this.role = role; }

    public String getRole() { return role; }

    @Override
    public String toString() {
        return "User{" +
                "login=" + login +
                ", password=" + password +
                ", role=" + role + '\'' +
                '}';
    }
}
