package Unit7.examples;

import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = getNextIntVal(in,1,5);
        System.out.println(choice);
    }
    public static int getNextIntVal(Scanner in, int min, int max){
        // this will keep prompting the user until a valid input
        boolean keepGoing = true;
        int num = 1;
        while(keepGoing){
            try {
                System.out.println("Enter an integer from " + min + " to " + max + ".");
                num = in.nextInt();
                // Now that I have an integer, I want to make sure the int is in the range I want (9-12)
                if (num >= min && num <= max) {
                    System.out.println("You have input " + num + "!");
                    keepGoing = false;
                } else {
                    System.out.println("That is not a valid integer!");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input, enter an int");
                in.nextLine();
            } // dummy read to clear out the bad input
        }
        return num;
    }
}
