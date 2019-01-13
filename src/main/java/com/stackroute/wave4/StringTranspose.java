package com.stackroute.wave4;

    /*String Transpose*/

public class StringTranspose
{
    public String reverseString(String str)
    {
        if (str != null)
        {
            String[] words = str.split(" ");
            String reversedString = "";
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);

                }
                reversedString = reversedString + reverseWord + " ";
            }
            reversedString = reversedString.trim();
            return reversedString;
        }
        return null;
    }
}
