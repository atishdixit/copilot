package com.copilot.demo.web.service;

import com.copilot.demo.web.domain.User;
import com.copilot.demo.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    //Add user repository autowired it
    @Autowired
    private UserRepository userRepository;  ;



    private List<User> users = new ArrayList<>();

    public UserService(){
        users.add(new User("Atish","asc@gmail.co", "123"));
    }

    public void addUser(User user){
        userRepository.addUser();
        users.add(user);
    }

    public List<User> getUsers(){
        return users;
    }

    public User getUser(String email){
        for(User user: users){
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }
    //Delete user by email
    public void deleteUser(String email){
        User user = getUser(email);//get user by email
        if(user != null){//if user exists
            users.remove(user);//remove user
        }
    }


    public void updateUser(User user){
        User u = getUser(user.getEmail());
        if(u != null){
            u.setName(user.getName());
            u.setPassword(user.getPassword());
        }
    }

    public boolean validateUser(String email, String password){
        User user = getUser(email);
        if(user != null && user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
    //Check if user exists
    public boolean isUserExists(String email){
        User user = getUser(email);
        if(user != null){
            return true;
        }
        return false;
    }
    //get user by name
    public User getUserByName(String name){
        for(User user: users){
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }
    public User getUserByEmail(String email){
        for(User user: users){
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }



}
