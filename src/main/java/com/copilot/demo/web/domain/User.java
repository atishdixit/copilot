package com.copilot.demo.web.domain;

import java.util.Comparator;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Name: " + name + " Email: " + email + " Password: " + password;
    }

    public boolean equals(Object o) {
        if (o instanceof User) {
            User u = (User) o;
            return name.equals(u.name) && email.equals(u.email) && password.equals(u.password);
        }
        return false;
    }

    public int hashCode() {
        return name.hashCode() + email.hashCode() + password.hashCode();
    }

    //Add comparators for sorting users by name and email and id with lambda expression
    public static final Comparator<User> ID_COMPARATOR = (user1, user2) -> user1.id - user2.id;
    public static final Comparator<User> NAME_COMPARATOR = (user1, user2) -> user1.getName().compareTo(user2.getName());
    public static final Comparator<User> EMAIL_COMPARATOR = (user1, user2) -> user1.getEmail().compareTo(user2.getEmail());
}
