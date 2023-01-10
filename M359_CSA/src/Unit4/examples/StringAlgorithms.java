package Unit4.examples;

public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";
        String str = "";
        String newStr = "";

        // print every other character of mySchool on the same line
        for (int i = 0; i < mySchool.length() + 1; i += 2){
            str += mySchool.substring(i, i + 1);
        }
        System.out.println(str);

        // print the String mySchool in reverse (all characters on the same line)
        for (int i = mySchool.length(); i > 0; i--){
            newStr += mySchool.substring(i - 1, i);
        }
        System.out.println(newStr);




         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        String animal = "monkey";
        String animalStr = "";
        for (int i = 0; i < animal.length(); i++){
            animalStr += "\n" + animal.substring(0, i + 1);
        }
        System.out.println(animalStr);




        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";
        int count = 0;

        for (int i = 0; i < phrase.length(); i++){
            count += phrase.indexOf("little");
        }

        // Print the amount of times the word "little" appears within phrase?
        System.out.println("The word \"little\" appears in the phrase " + count + " times.");


        // create a new String, or modify the existing String, that removes
        // the word "little" entirely





        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"




    }
}
