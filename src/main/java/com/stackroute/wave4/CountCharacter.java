package com.stackroute.wave4;

/*This program to count the total number of occurrences of a given character in a string */

public class CountCharacter {

    public int countCheckcharacter(String checkString, char checkCharacter) {
        if (checkString != null) {

            String regexString = Character.toString(checkCharacter);
            String[] splitString = checkString.split(regexString);
            return splitString.length - 1;
        }
        return 0;
    }
}



