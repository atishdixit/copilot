package com.copilot.demo;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class SuggestionTest {

    @Test
    void calculateDayBetweenDates() {
        Suggestion suggestion = new Suggestion();
        assertEquals(0, suggestion.calculateDayBetweenDates(new Date(), new Date()));
    }
}