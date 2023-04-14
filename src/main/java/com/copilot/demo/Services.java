package com.copilot.demo;

import java.util.Arrays;

public class Services {


    //Create variable for name, email, password, phone number and address
    //Create getter and setter for all the variables
    //Create constructor for all the variables
    //Create toString method
    //Create equals method
    //Create hashcode method
    //Create a method to get all the users
    //Create a method to get all the users by name
    //Create a method to get all the users by email
    //Create a method to get all the users by phone number
    //Create a method to get all the users by address
    //Create a method to get all the users by name and email
    //Create a method to get all the users by name and phone number
    //Create a method to get all the users by name and address
    //Create a method to get all the users by email and phone number
    //Create a method to get all the users by email and address
    //Create a method to get all the users by phone number and address

    //Create a method to get all the users by name, email and phone number
    //Create a method to get all the users by name, email and address
    //Create a method to get all the users by name, phone number and address
    //Create a method to get all the users by email, phone number and address
    //Create a method to get all the users by name, email, phone number and address



    //check if the string is a palindrome
    public static boolean isPalindrome(String s) {
        String reverse = StringUtils.reverse(s);
        return s.equals(reverse);
    }

    //check if it is valid email
    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }

    //check if it is valid password and contains at least 8 characters and at least one number and atleast one special character
    public static boolean isValidPassword(String password) {
        return password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*\\W.*");
    }

    //validate name should contain only alphabets and spacial character !@#$%_- only and should not be empty
    // also should not contain any number and check null value
    // method name should be isValidName
    // add comments and test cases
    public static boolean isValidName(String name) {
        return name.matches("^[a-zA-Z0-9!@#$%_-]*$") && name.length() > 0;
    }

    // Write a method to check if the given string is a valid phone number
    // Phone number should be 10 digits and should not contain any special character
    // method name should be isValidPhoneNumber
    // add comments and test cases
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^[0-9]*$") && phoneNumber.length() == 10;
    }

    //Add variable for name, email, password, phone number and address
    String name;
    String email;
    String password;
    String phoneNumber;
    String address;

    //Create getter and setter for all the variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Create constructor for all the variables
    public Services(String name, String email, String password, String phoneNumber, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    //Create toString method
    public String toString() {
        return "Name: " + name + " Email: " + email + " Password: " + password + " Phone Number: " + phoneNumber + " Address: " + address;
    }

    //Create equals method
    public boolean equals(Object o) {
        if (o instanceof Services) {
            Services u = (Services) o;
            return name.equals(u.name) && email.equals(u.email) && password.equals(u.password) && phoneNumber.equals(u.phoneNumber) && address.equals(u.address);
        }
        return false;
    }

    //Create hashcode method
    public int hashCode() {
        return name.hashCode() + email.hashCode() + password.hashCode() + phoneNumber.hashCode() + address.hashCode();
    }

    //Create a method to get all the users
    public static void getAllUsers() {
        System.out.println("Get all users");
    }

    //Create a method to get all the users by name
    public static void getAllUsersByName(String name) {
        System.out.println("Get all users by name: " + name);
    }

    //Create a method to get all the users by email

    public static void getAllUsersByEmail(String email) {
        System.out.println("Get all users by email: " + email);
    }

    //Create a method to get all the users by phone number

    public static void getAllUsersByPhoneNumber(String phoneNumber) {
        System.out.println("Get all users by phone number: " + phoneNumber);
    }

    //Create a method to get all the users by address

    //method to remove all the spaces from the string
    public static String removeSpaces(String s) {
        return s.replaceAll("\\s", "");
    }

    //method to remove all the special characters from the string
    public static String removeSpecialCharacters(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }

    //method to sort the string in alphabetical order
    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    //method to check two string are angaram or not
    public static boolean isAnagram(String s1, String s2) {
        return sortString(removeSpaces(removeSpecialCharacters(s1))).equalsIgnoreCase(sortString(removeSpaces(removeSpecialCharacters(s2))));
    }










}
