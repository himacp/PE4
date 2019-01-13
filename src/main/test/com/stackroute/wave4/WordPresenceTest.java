package com.stackroute.wave4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class WordPresenceTest {

    WordPresence wordpresenceobj;
    @Before
    public void setUp()
    {
        wordpresenceobj=new WordPresence();
    }
    @After
    public void tearDown()
    {
        wordpresenceobj=null;
    }

    @Test
    public void WordPresenceSuccess()
    {
        String originalString="Harry is an engineer";
        String actualValue=wordpresenceobj.checkHarry(originalString);
        String expectedValue="Is Harry here ? true";
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testTransposeStringFailure()
    {
        String originalString="Harry is an engineer";
        String actualValue=wordpresenceobj.checkHarry(originalString);
        String expectedValue="Jhony";
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void testTransposeStringNeutral()
    {
        String actualValue=wordpresenceobj.checkHarry(null);
        String expectedValue=null;
        assertEquals(null, actualValue);
    }

}