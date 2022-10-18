package Unit4.PigLatinLab;

public class PigLatin {
    public static String toPigLatin(String str){
        String newStr = "";

        if (str.substring(0, 1) == "a"){
            for (int i = str.length() - 1; i > 0; i--){
                newStr += str.charAt(i);
            }
        }


        return newStr;
    }
    public static String translateWordToPigLatin(String str){
        String newStr = "";
        // check if the str contains a vowel aeiou
        if (str.substring(0, 1).equals("a")|| str.substring(0, 1).equals("e") || str.substring(0, 1).equals("i") ||
        str.substring(0, 1).equals("o") || str.substring(0, 1).equals("u")){
            for (int i = str.length() - 1; i > 1; i--){
                newStr += str.charAt(i);
            }
            newStr += "yay";
        }
        else{
            for (int j = str.length() - 1; j > 1; j--){
                newStr += str.charAt(j);
            }
            newStr += "ay";
        }
        // check if the str contains the consonant or consanant cluster
        return newStr;
    }
}
