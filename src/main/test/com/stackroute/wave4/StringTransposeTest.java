package com.stackroute.wave4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StringTransposeTest {

    StringTranspose transposeStringobj;
    @Before
    public void setUp()
    {
        transposeStringobj=new
                StringTranspose ();
    }
    @After
    public void tearDown()
    {
        transposeStringobj=null;
    }

    @Test
    public void testTransposeStringSuccess()
    {
        String originalString="a quick brown fox jumps over the lazy dog";
        String actualValue=transposeStringobj.reverseString(originalString);
        String expectedValue="a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testTransposeStringFailure()
    {
        String originalString="a quick brown fox jumps over the lazy dog";
        String actualValue=transposeStringobj.reverseString(originalString);
        String expectedValue="a kciuq nworb xof jumps revo eht yzal god";
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void testTransposeStringNeutral()
    {
        String actualValue="";
        String expectedValue=null;
        assertNotNull(expectedValue,actualValue);
    }
}