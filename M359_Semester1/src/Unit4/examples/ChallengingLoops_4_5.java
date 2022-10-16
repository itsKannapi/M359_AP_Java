package Unit4.examples;

public class ChallengingLoops_4_5 {
    public static void main(String[] args) {
        // Challenge #1
        for (int i = 5; i > 0; i--){
            for (int k = 1; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("\n");
        // Challenge #2
        for (int i = 5; i > 0; i--){
            for (int k = 1; k < i + 1; k++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("\n");

        everyOtherLetterPyramid("FremdVikings");

        System.out.println("\n");

        everyOtherWordBackwards("Boy these loops are tricky!");
    }
    public static void everyOtherLetterPyramid(String str) {
        String newStr = str;
        System.out.println(str);
       for (int i = newStr.length(); i > 0; i--) {
            String printedStr = "";
            for (int j = 0; j < newStr.length(); j += 2) {
                printedStr += newStr.charAt(j);
            }
            System.out.println(printedStr);
            if (newStr.length() <= 2) {
                newStr = "";
            }
            else {
                newStr = printedStr;
            }
        }
    }
    public static void everyOtherWordBackwards(String str) {
        String newStr = str;
        while (newStr.length() != 0) {
            int spaceLocation = newStr.indexOf(" ");

            if (spaceLocation != -1) {
                for (int location = spaceLocation - 1; location >= 0; location--) {
                    System.out.print(newStr.charAt(location));
                }
                System.out.print(" ");
                newStr = newStr.substring(spaceLocation + 1);
            }
            else {
                for (int location = newStr.length() - 1; location >= 0; location--) {
                    System.out.print(newStr.charAt(location));
                }
                newStr = "";
            }
        }
    }

}
