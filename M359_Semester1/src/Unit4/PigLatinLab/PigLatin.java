package Unit4.PigLatinLab;

public class PigLatin {
    public static String toPigLatin(String str){
        String newStr = "";
        str = str.toLowerCase();
        // index of
        // int instanceSpace = str.indexOf(" ");
        // when translated the first word, change the index of the former phrase to be translated the word of 0
        for (int k = 0; k < str.length(); k++){
            if (checkForSpace(str, k)){
                
            }
        }
        return newStr;
    }
    public static String translateWordToPigLatin(String s){
        String newStr = "";
        // check if the str contains a vowel aeiou
        if (checkForVowel(s, 0)){
            for (int i = 0; i < s.length(); i++){
                newStr += s.charAt(i);
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
