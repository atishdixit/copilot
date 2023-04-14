package com.copilot.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("dlrow olleh", StringUtils.reverse("hello world"));
    }

    @Test
    void reverseWords() {
       assertEquals("olleh", StringUtils.reverseWords("hello"));
        assertEquals("dlrow olleh", StringUtils.reverseWords("hello world"));
    }

    @Test
    void countSubstring() {
        assertEquals(2, StringUtils.countSubstring("hello", "l"));
        assertEquals(1, StringUtils.countSubstring("hello", "ll"));
        assertEquals(0, StringUtils.countSubstring("hello", "z"));
    }

}