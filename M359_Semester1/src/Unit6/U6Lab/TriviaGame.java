package Unit6.U6Lab;

import Unit6.CourseStudentExample.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    public Question[] questionsArray;

//    public boolean checkAnswer(){
//
//    }

    public TriviaGame(int num) {
        this.questionsArray = new Question[num];
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
            }
        }
    }
}
