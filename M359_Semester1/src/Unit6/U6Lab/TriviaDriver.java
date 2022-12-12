package Unit6.U6Lab;


import java.io.FileNotFoundException;
import java.util.Scanner;


public class TriviaDriver {
    private static boolean gameState = false;
    public static int questionNumber = 0;
    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame myGame = new TriviaGame(12);
        myGame.readTxtFile();
        Scanner input = new Scanner(System.in);
        System.out.println("≻〉 ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ ⋆Welcome to Apple Trivia!⋆ ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 〈≺");
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println("Hello " + userName + "! Lets find out how much you know about Apple!");
        System.out.println();

        while (!gameState){
            myGame.getQuestion(questionNumber);
            System.out.println();
            System.out.println("What is your answer?");
            String answer = input.nextLine();
            myGame.checkAnswer(answer, questionNumber);
            System.out.println("Would you like to continue?");
            String leaveStat = input.nextLine();
            if (leaveStat.equals("yes")){
                gameState = false;
            }
            else {
                gameState = true;
            }
            if(questionNumber == 11){
                gameState = false;
            }
            else{
                questionNumber++;
            }
        }
    }
}
