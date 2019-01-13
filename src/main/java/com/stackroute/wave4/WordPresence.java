package com.stackroute.wave4;

/*A program with the implementation of Regular Expression to find the presence of the name Harry in a string.*/

public class WordPresence {
    public String checkHarry(String inputString) {
        if (inputString != null) {
            String[] splitString = inputString.split("Harry"); //splitting based on the name "harry"
            if (splitString.length > 1) {
                return "Is Harry here ? true";
            } else {
                return "Is Harry here ? false";
            }
        }
        return null;
    }
}