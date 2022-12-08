package Unit6.U6Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    Question[] questionsArray = new Question[12];

    public void readTxtFile() throws FileNotFoundException {
        File file = new File("questionsandMCProblems.txt");
        Scanner inF = new Scanner(file);
        //dummy read because of trivia game title
        if(inF.hasNextLine()){
            inF.nextLine();
        }
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
            }
        }
    }
}
