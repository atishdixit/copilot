package com.copilot.demo;

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



}
