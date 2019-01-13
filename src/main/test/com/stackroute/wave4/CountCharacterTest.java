package com.stackroute.wave4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountCharacterTest {

    CountCharacter countoccurance;

    @Before
    public void setUp() {
        countoccurance = new CountCharacter();
    }

    @After
    public void tearDown() {
        countoccurance = null;
    }

    @Test
    //success test case
    public void testCountNumOccuranceSuccess() {
        String originalString = "Java is java again java again";
        int actualValue = countoccurance.countCheckcharacter(originalString, 'a');
        int expectedValue = 10;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testCountNumOccuranceFailure() {
        String originalString = "Java is java again java again";
        int actualValue = countoccurance.countCheckcharacter(originalString,'a');
        int expectedValue = 12;
        assertNotEquals(expectedValue, actualValue);

    }
    @Test
    public void testCountNumOccuranceNeutral()
    {
        String originalString="";
        int actualValue=countoccurance.countCheckcharacter(originalString,'f');
        assertNotNull(actualValue);

        originalString=null;
        actualValue=countoccurance.countCheckcharacter(originalString,'c');
        int expectedValue=0;
        assertEquals(expectedValue,actualValue);
    }
}