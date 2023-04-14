package com.copilot.demo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringUtils {
public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static String reverseWords(String s) {
        String result = "";
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            result += reverse(words[i]) + " ";
        }
        return result.trim();
    }


    public static String reverseWords2(String s) {
        String result = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            result += reverse(words[i]) + " ";
        }
        return result;
    }

    public static String reverseWords3(String s) {
        String result = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            result += reverse(words[i]) + " ";
        }
        return result;
    }

    public static String reverseWords4(String s) {
        String result = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            result += reverse(words[i]) + " ";
        }
        return result;
    }

    public static String reverseWords5(String s) {
        String result = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            result += reverse(words[i]) + " ";
        }
        return result;
    }

    public static String reverseWords6(String s) {
        String result = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            result += reverse(words[i]) + " ";
        }
        return result;
    }

    public static String reverseWords7(String s) {
        String result = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            result += reverse(words[i]) + " ";
        }
        return result;
    }


    public String removeVowels(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                result += c;
            }
        }
        return result;
    }

    //method will remove any substring from the string
    public String removeSubstring(String s, String sub) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i + sub.length() <= s.length()) {
                String temp = s.substring(i, i + sub.length());
                if (!temp.equals(sub)) {
                    result += s.charAt(i);
                } else {
                    i += sub.length() - 1;
                }
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }

    //method will count the substring in the string
    public static int countSubstring(String s, String sub) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + sub.length() <= s.length()) {
                String temp = s.substring(i, i + sub.length());
                if (temp.equals(sub)) {
                    count++;
                }
            }
        }
        return count;
    }
    //test this method
    public static void main(String[] args) {
        StringUtils su = new StringUtils();
        System.out.println(su.countSubstring("hello world hello", "llo"));
    }
//    //test above method
//    public static void main(String[] args) {
//        StringUtils su = new StringUtils();
//        System.out.println(su.removeSubstring("hello world", "llo"));
//    }

    // method will return prefix of the string
    public String prefix(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(i);
            if (s.substring(i + 1).contains(result)) {
                return result;
            }
        }
        return result;
    }

    //Method to check start and end of the string
    public boolean checkStartEnd(String s, String start, String end) {
        if (s.startsWith(start) && s.endsWith(end)) {
            return true;
        }
        return false;
    }

    //Method to check contains of the substring
    public boolean checkContains(String s, String sub) {
        if (s.contains(sub)) {
            return true;
        }
        return false;
    }

    //Method to split the string and return the List
    public List<String> splitString(String s, String split) {
        List<String> list = new ArrayList<>();
        String[] arr = s.split(split);
        for (String str : arr) {
            list.add(str);
        }
        return list;
    }

    //Method to get occurance of the character in the string
public int getOccurance(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    // Method to get count of each character in the string
    public Map<Character, Integer> getCount(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    // Method to check given pattern is present in the string
    public boolean checkPattern(String s, String pattern) {
        if (s.matches(pattern)) {
            return true;
        }
        return false;
    }

    //Method to write generic method to convert string to any type
    public <T> T convertString(String s, Class<T> type) {
        if (type == Integer.class) {
            return (T) Integer.valueOf(s);
        } else if (type == Double.class) {
            return (T) Double.valueOf(s);
        } else if (type == Float.class) {
            return (T) Float.valueOf(s);
        } else if (type == Long.class) {
            return (T) Long.valueOf(s);
        } else if (type == Short.class) {
            return (T) Short.valueOf(s);
        } else if (type == Byte.class) {
            return (T) Byte.valueOf(s);
        } else if (type == Boolean.class) {
            return (T) Boolean.valueOf(s);
        } else if (type == Character.class) {
            return (T) Character.valueOf(s.charAt(0));
        } else if (type == String.class) {
            return (T) s;
        }
        return null;
    }

    //Method to convert JSON string to Map
    public Map<String, Object> convertJsonToMap(String json) {
        Map<String, Object> map = new HashMap<>();
        try {
            map = new ObjectMapper().readValue(json, new TypeReference<Map<String, Object>>() {
            });
        } catch (IOException ex) {
            Logger.getLogger(StringUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }
}
