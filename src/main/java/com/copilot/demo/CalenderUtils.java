package com.copilot.demo;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalenderUtils {

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month";
                break;
        }
        return monthName;
    }

    public static  String getYearday(int month, int day) {
        int yearday = 0;
        switch (month) {
            case 1:
                yearday = day;
                break;
            case 2:
                yearday = 31 + day;
                break;
            case 3:
                yearday = 59 + day;
                break;
            case 4:
                yearday = 90 + day;
                break;
            case 5:
                yearday = 120 + day;
                break;
            case 6:
                yearday = 151 + day;
                break;
            case 7:
                yearday = 181 + day;
                break;
            case 8:
                yearday = 212 + day;
                break;
            case 9:
                yearday = 243 + day;
                break;
            case 10:
                yearday = 273 + day;
                break;
            case 11:
                yearday = 304 + day;
                break;
            case 12:
                yearday = 334 + day;
                break;
            default:
                yearday = 0;
                break;
        }
        return "Yearday: " + yearday;
    }

    public static Instant getCurrInstant() {
        return Instant.now();
    }

    public static Date getCurrDate() {
        return new Date();
    }

    public static Instant getInstantFromEpoch(long epoch) {
        return Instant.ofEpochMilli(epoch);
    }

    public static Date getDateFromEpoch(long epoch) {
        return new Date(epoch);
    }

    public static Instant convertDateToInstant(Date date) {
        return date.toInstant();
    }

    public int calculateDaysBetweenDate(LocalDate localDate1, LocalDate localDate2) {
        return (int) (localDate2.toEpochDay() - localDate1.toEpochDay());
    }

}
