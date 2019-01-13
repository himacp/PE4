package com.stackroute.wave4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Program to find out the multiple occurrences of the given word in a string using Matcher methods.*/

public class MultipleOccurance
{

    public String findOcuurance(String originalString, String checkString)
    {
        if (originalString == null)
        {
            return null;
        }
        if (!originalString.contains(checkString))
        {
            return "Input doesn't string";
        }
        Pattern pattern = Pattern.compile(checkString);
        Matcher matcher = pattern.matcher(originalString);
        String resultString = "";

        while (matcher.find())
        {
            resultString = resultString + "Found at: " + matcher.start() + " - " + matcher.end() + " ";
        }
        resultString = resultString.trim();
        return resultString;

    }


}