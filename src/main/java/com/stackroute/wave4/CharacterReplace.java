package com.stackroute.wave4;
/*Program to replace all d with f and all l with t in the given String*/

public class CharacterReplace {

        public String replaceCharacterMethod(char originalstr1, char replace1, char originalstr2, char replace2, String originalString) {
                if (originalString != null) {
                        String replaceString = "";
                        replaceString = originalString.replace(originalstr1, replace1); //replace of original string1
                        replaceString = replaceString.replace(originalstr2, replace2); //replace of original string2
                        return replaceString;
                }
                return null;
        }
}

