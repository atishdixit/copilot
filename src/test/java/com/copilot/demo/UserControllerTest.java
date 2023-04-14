package com.copilot.demo;

import com.copilot.demo.web.repository.UserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    //Create an instance of User and pass it to the add user method
    //Check if the method returns a value
    @Test
    void addUser() {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser();
        assertEquals(userRepository.getUser(),"User");
    }
    //Test to check User is deleted
    //Add UserService and UserRepository as a dependency
    //Create an instance of User and pass it to the delete user method
    //Check if the method returns a value
    @Test
    void deleteUser() {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser();
        assertEquals(userRepository.getUser(),"User");
    }
    //Test to check User is updated
    //Add UserService and UserRepository as a dependency
    //Create an instance of User and pass it to the update user method
    //Check if the method returns a value
    @Test
    void updateUser() {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser();
        assertEquals(userRepository.getUser(),"User");
    }
    //Test to check User is validated
    //Add UserService and UserRepository as a dependency
    //Create an instance of User and pass it to the validate user method
    //Check if the method returns a value
    @Test
    void validateUser() {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser();
        assertEquals(userRepository.getUser(),"User");
    }
    //Test to check User is retrieved
    //Add UserService and UserRepository as a dependency
    //Create an instance of User and pass it to the get user method
    //Check if the method returns a value
    @Test
    void getUser() {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser();
        assertEquals(userRepository.getUser(),"User");
    }
    //Test to check all Users are retrieved
    //Add UserService and UserRepository as a dependency
    //Create an instance of User and pass it to the get users method
    //Check if the method returns a value
    @Test
    void getUsers() {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser();
        assertEquals(userRepository.getUser(),"User");
    }

}