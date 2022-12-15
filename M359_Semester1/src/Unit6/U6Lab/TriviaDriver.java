package Unit6.U6Lab;


import java.io.FileNotFoundException;
import java.util.Scanner;


public class TriviaDriver {
    private static boolean gameState = true;
    public static int totalPoints = 0;
    public static int streak = 0;
    public static int totalCorrect = 0;
    public static int totalIncorrect = 0;

    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame myGame = new TriviaGame(12);
        myGame.readTxtFile();
        int questionsAnswered = 0;
        //int totalPoints = 0;
        //int currentStreak = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("≻〉 ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ ⋆Welcome to Apple Trivia!⋆ ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 〈≺");
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println("Hello " + userName + "! Lets find out how much you know about Apple!");
        System.out.println();

        while (gameState && questionsAnswered != 12){
            int questionNumber = (int) (Math.random() * 11);
            myGame.getQuestion(questionNumber);
            System.out.println();
            System.out.println("What is your answer?");
            String answer = input.nextLine();
            myGame.checkAnswer(answer, questionNumber);
            myGame.printStatisticString(answer, questionNumber);
            System.out.println("Would you like to continue?");
            String leaveStat = input.nextLine();
            if (leaveStat.equals("yes")){
                gameState = true;
            }
            else {
                gameState = false;
            }
            questionsAnswered++;
        }

        System.out.println("≻〉 ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ ⋆Game Over!⋆ ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ 〈≺");
        System.out.println("Total Points: " + totalPoints);
        System.out.println("Amount Correct: " + totalCorrect);
        System.out.println("Amount Incorrect: " + totalIncorrect);
        System.out.println("correct out of questions " + totalCorrect + "/" + questionsAnswered);
    }

}
