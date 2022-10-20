package Unit4.PigLatinLab;

import java.util.Locale;

public class PigLatin {
    public static String toPigLatin(String str){
        String newStr = "";
        str = str.toLowerCase();

        for (int k = 1; k < str.length(); k++){
            while(str.charAt(k) != ' '){
                newStr += translateWordToPigLatin(str);
            }
        }



        return newStr;
    }
    public static String translateWordToPigLatin(String s){
        String newStr = "";
        // check if the str contains a vowel aeiou
        if (checkForVowel(s, 0)){
            for (int i = 1; i < s.length(); i++){
                newStr += s.charAt(i);
            }
            newStr += "yay";
        }
        // checks if there's consonant cluster
        else if (checkForVowel(s, 1)){
            for (int i = 2; i < s.length(); i++){
                newStr += s.charAt(i);
            }
            newStr += "ay";
        }
        // returns as normal w/ normal consonants
        else{
            for (int j = 1; j < s.length(); j++){
                newStr += s.charAt(j);
            }
            newStr += "ay";
        }
        return newStr;
    }
    // create a helper method that checks if the word starts with a vowel
    //
    public static boolean checkForVowel(String str, int index){
        if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
                || str.charAt(index) == 'o' || str.charAt(index) == 'u'){
            return true;
        }
        else{
            return false;
        }
    }
    // create a helper method that checks if there's a space
    public static boolean checkForSpace(String str, int index){
        if (str.charAt(index) == ' '){
            return true;
        }
        else{
            return false;
        }
    }
}
