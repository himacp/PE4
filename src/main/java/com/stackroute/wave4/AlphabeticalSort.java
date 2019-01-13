package com.stackroute.wave4;
import java.util.Arrays;
import java.util.Comparator;

  /*Program that sets up a String variable containing a paragraph of text of your choice.
          a. Extract the words from the text and sort them into alphabetical order.
          b. Display the sorted list of words.*/

public class AlphabeticalSort {

        public String sortingMethod( String originalString)
        {
            if( originalString == null )
            {
                return null;
            }
            String splitString[] =originalString.split(" "); //splitting by space
            String replaceString="";
            for( String subString : splitString)
            {
                Character[] wordsArray = new Character[subString.length()];

                for (int i = 0; i < wordsArray.length; i++) {
                    wordsArray[i] = subString.charAt(i);
                }
                Arrays.sort(wordsArray, new Comparator<Character>() {

                    public int compare(Character character1, Character character2)
                    {
                        // ignoring case
                        return Character.compare(Character.toLowerCase(character1),
                                Character.toLowerCase(character2));
                    }

                });
                for( Character c : wordsArray )
                {
                    replaceString=replaceString+Character.toString(c);
                }
                replaceString+=" ";
            }
            replaceString=replaceString.trim();
            return replaceString;

        }

    }

