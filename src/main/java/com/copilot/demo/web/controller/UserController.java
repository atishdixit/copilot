package com.copilot.demo.web.controller;


import com.copilot.demo.web.domain.User;
import com.copilot.demo.web.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

//    @RequestMapping("/all")
//    public List<User> getUsers(){
//        return userService.getUsers();
//    }

//    //Get user by email
//    @RequestMapping(value = "/{email}", produces = "application/json",
//            method = RequestMethod.GET)
//    public User getUser(@PathVariable("email") String email){
//        return userService.getUser(email);
//    }
//
    //get All users
    @RequestMapping(value = "/all", produces = "application/json",
            method = RequestMethod.GET)
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @RequestMapping(value = "/add", consumes = "application/json",
            produces = "application/json",
            method = RequestMethod.POST)
    public void addUser(User user){
        userService.addUser(user);
    }

    @RequestMapping("/delete")
    public void deleteUser(String email){
        userService.deleteUser(email);
    }

    @RequestMapping("/update")
    public void updateUser(User user){
        userService.updateUser(user);
    }

    @RequestMapping("/validate")
    public boolean validateUser(String email, String password){
        return userService.validateUser(email, password);
    }

    @RequestMapping("/exists")
    public boolean isUserExists(String email){
        return userService.isUserExists(email);
    }

    @RequestMapping("/get")
    public User getUser(@PathParam("email") String email){
        return userService.getUser(email);
    }

}
