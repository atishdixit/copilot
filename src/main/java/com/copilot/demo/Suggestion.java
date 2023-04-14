package com.copilot.demo;

import java.util.Date;

public class Suggestion {
    int calculateDayBetweenDates(Date date1, Date date2) {
        long diff = date2.getTime() - date1.getTime();
        return (int) (diff / (1000 * 60 * 60 * 24));
    }

    //generate random string of length n using characters from a-z and 0-9 special characters
    public String generateRandomString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

    //

}
