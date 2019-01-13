package com.stackroute.wave4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class CharacterReplaceTest
{

    CharacterReplace replaceCharacterobj;
    @Before
    public void setUp()
    {
        replaceCharacterobj = new CharacterReplace();
    }
    @After
    public void tearDown()
    {
        replaceCharacterobj=null;
    }

    @Test
    public void testReplaceCharacterSuccess()
    {
        String actualValue=replaceCharacterobj.replaceCharacterMethod('o','f','l','t',"chocolate");
        String expectedValue="chfcftate";
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testReplaceCharacterfailure()
    {

        String actualValue=replaceCharacterobj.replaceCharacterMethod('k','f','l','t',"kit kat");
        String expectedValue="kit kat";
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void testReplaceCharacterNeutral()
    {

        String actualValue=replaceCharacterobj.replaceCharacterMethod('d','f','0','t',"");
        assertNotNull(actualValue);

        actualValue=replaceCharacterobj.replaceCharacterMethod('d','f','0','t',null );
        assertNull(actualValue);
    }


}