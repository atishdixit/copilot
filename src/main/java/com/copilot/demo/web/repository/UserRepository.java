package com.copilot.demo.web.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {


    //method to add the user
    public void addUser() {
        System.out.println("User");
    }
    //method to delete the user
    public String getUser() {
        System.out.println("User");
        return "User";
    }
    //method to update the user
    public void updateUser() {
        System.out.println("User");
    }

//method to get all the users
    public void getUsers() {
        System.out.println("User");
    }

    //method to validate the user
    public void validateUser() {
        System.out.println("User");
    }
}
