package Unit4.PigLatinLab;

public class PigLatin {
    public static String toPigLatin(String str){
        String curString = str;
        String newStr = "";
        String tempStr = "";
        str = str.toLowerCase();
        // index of
        // int instanceSpace = str.indexOf(" ");
        // when translated the first word, change the index of the former phrase to be translated the word of 0
        for (int k = 0; k < curString.length(); k++){
            // if there is a space
            if (checkForSpace(curString, k)){
                // chop off the beginning of the string to the area with a space
                tempStr = str.substring(0, k);
                translateWordToPigLatin(tempStr);
                newStr += tempStr;
                // cut off the word that was just turned into a pig latin
                curString = curString.substring(k, curString.length() - 1);
            }
        }
        return newStr;
    }
    public static String translateWordToPigLatin(String s){
        String newStr = "";
        // check if the str contains a vowel aeiou
        if (checkForVowel(s, 0)){
            for (int l = 0; l < s.length(); l++){
                newStr += s.charAt(l);
            }
            newStr += "yay";
        }
        // checks if there's consonant cluster
        else if (!checkForVowel(s, 1)){
            for (int i = 2; i < s.length(); i++){
                newStr += s.charAt(i);
            }
            newStr += s.substring(0,2) + "ay";
        }
        // returns as normal w/ normal consonants
        else{
            for (int j = 1; j < s.length(); j++){
                newStr += s.charAt(j);
            }
            newStr += s.charAt(0) + "ay";
        }
        return newStr;
    }
    // create a helper method that checks if the word starts with a vowel
    //
    public static boolean checkForVowel(String str, int index){
        return str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
                || str.charAt(index) == 'o' || str.charAt(index) == 'u';
    }
    // create a helper method that checks if there's a space
    public static boolean checkForSpace(String str, int index){
        return str.charAt(index) == ' ';
    }
}
