package com.stackroute.wave4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MultipleOccuranceTest {
    MultipleOccurance occurance;
    @Before
    public void setUp()
    {
        occurance=new MultipleOccurance();
    }
    @After
    public void tearDown()
    {
        occurance =null;
    }

    @Test
    public void testOccuranceStringSuccess()
    {
        String actualValue=occurance.findOcuurance("She sells seashells by the seashore","se");
        String expectedValue="Found at: 4 - 6 "+"Found at: 10 - 12 "+"Found at: 27 - 29";
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testOccuranceStringFailure()
    {

        String actualValue=occurance.findOcuurance("She sells sea seashells by the seashore","se");
        String expectedValue="Found at: 4 - 6 "+"Found at: 9 - 12 "+"Found at: 20 - 25";
        assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void testOccuranceNull()
    {

        String actualValue=occurance.findOcuurance("","se");
        String expectedValue="Input doesn't contain string";
        assertNotNull(expectedValue,actualValue);

        actualValue=occurance.findOcuurance(null,"se");
        assertNull(actualValue);

    }


}