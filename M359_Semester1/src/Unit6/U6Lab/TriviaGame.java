package Unit6.U6Lab;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    public static Question[] questionsArray;
    public static String[] correctAnswers = new String[12];

    public static void getQuestion(int qNum){
        System.out.println(questionsArray[qNum]);
    }
    public void checkAnswer(String a, int qNum){
        if (a.equals(correctAnswers[qNum])){
            System.out.println("The answer is correct");
        }
        else{
            System.out.println("Incorrect! The answer was " + correctAnswers[qNum]);
        }
    }

    public TriviaGame(int num) {
        questionsArray = new Question[num];
    }

    public static void readTxtFile() throws FileNotFoundException {
        File file = new File("questionsandMCProblems.txt");
        Scanner inF = new Scanner(file);
        //dummy read because of trivia game title
        if(inF.hasNextLine()){
            inF.nextLine();
        }
        Question[] questionsArray = new Question[12];
        while(inF.hasNextLine()) {
            //use the for loop to read the file multiple times
            for (int i = 0; i < questionsArray.length; i++) {
                String questionLine = inF.nextLine();
                String answerA = inF.nextLine();
                String answerB = inF.nextLine();
                String answerC = inF.nextLine();
                String answerD = inF.nextLine();
                String correctAnswer = inF.nextLine();

                Question q = new Question(questionLine, answerA, answerB, answerC, answerD, correctAnswer);
                questionsArray[i] = q;
                correctAnswers[i] = correctAnswer;
            }
        }
    }
}
