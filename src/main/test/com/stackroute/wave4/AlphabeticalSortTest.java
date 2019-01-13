package com.stackroute.wave4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
@RunWith(JUnit4.class)


public class AlphabeticalSortTest {
    AlphabeticalSort sortobj = new AlphabeticalSort();

    @Before
    public void setUp() {
        sortobj = new AlphabeticalSort();
    }

    @After
    public void tearDown() {

        sortobj = null;
    }

    @Test
    public void testSortWordsSuccess() {
        String originalString ="Hey I am fine";
        String actualValue = sortobj.sortingMethod(originalString);
        String expectedValue ="eHy I am efin";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testSortWordsFailure() {
        String originalString = "Hey I am good";
        String actualValue = sortobj.sortingMethod(originalString);
        String expectedValue = "eHy dooh I ma";
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void testSortWordsNeutral() {
        String originalString = null;
        String actualValue = sortobj.sortingMethod(originalString);
        String expectedValue = null;
        assertEquals(expectedValue, actualValue);
        originalString = "";
        actualValue = sortobj.sortingMethod(originalString);
        assertNotNull(actualValue);
    }
}