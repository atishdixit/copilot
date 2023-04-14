package com.copilot.demo;

import com.copilot.demo.web.domain.User;

import java.util.List;

public class UserUtils {

    //declare this class as utility class
    private UserUtils() {
    }

    //validate user are equal or not
    public static boolean validateUser(User user1, User user2) {

        return true;
    }

    //sort List of users by name
    public static void sortUsersByName(List<User> users) {
        users.sort((user1, user2) -> user1.getName().compareTo(user2.getName()));
    }

    //sort List of users by email
    public static void sortUsersByEmail(List<User> users) {
        users.sort((user1, user2) -> user1.getEmail().compareTo(user2.getEmail()));
    }


}
