package Unit4.examples;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 10 + 1) - 1;
        int count = 1;
        System.out.println("Guess a number from 1-10: ");
        int guessedNumber = input.nextInt();

        while (randomNum != guessedNumber){
            if (randomNum > guessedNumber){
                System.out.println("Your guess is too low");
            }
            else{
                System.out.println("Your guess to too high");
            }
            count++;

            System.out.println("Guess a number from 1-10: ");
            guessedNumber = input.nextInt();
        }

        System.out.println("Congrats! You guessed the number " + randomNum + " in " + count);
    }
}
