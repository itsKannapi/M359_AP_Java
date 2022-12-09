package Unit6.U6Lab;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    private static boolean gameState = false;
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame myGame = new TriviaGame(12);
        Scanner input = new Scanner(System.in);
        System.out.println("≻〉 ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ ⋆Welcome to Apple Trivia!⋆ ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 〈≺");
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println("Hello " + userName + "! Lets find out how much you know about Apple!");
        System.out.println();

        while (!gameState){
            myGame.readTxtFile();
            gameState = true;
        }
    }
}
