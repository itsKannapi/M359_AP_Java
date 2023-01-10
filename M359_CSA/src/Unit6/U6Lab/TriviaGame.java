package Unit6.U6Lab;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    public Question[] questionsArray;
    public String[] correctAnswers = new String[12];

    public TriviaGame(int num) {
        questionsArray = new Question[num];
    }

    /**
     * this method prints out a question for the user to answer
     * @param qNum question number that is put in the method
     */
    public void getQuestion(int qNum){
        System.out.println(questionsArray[qNum]);
    }

    /**
     * this method prints out to the user whether the question is correct
     * @param a the letter the user puts in
     * @param qNum the letter that is involved in the array
     */
    public void checkAnswer(String a, int qNum){
        if (a.equals(correctAnswers[qNum])){
            System.out.println("The answer is correct");
        }
        else{
            System.out.println("Incorrect! The answer was " + correctAnswers[qNum]);
        }
    }

    //unused?
    public void printStatisticString(String a, int qNum){
        int pointsGainOrLoss = 0;
        if (a.equals(correctAnswers[qNum])) {
            pointsGainOrLoss = 1;
            TriviaDriver.totalPoints++;
            TriviaDriver.streak++;
            TriviaDriver.totalCorrect++;
        }
        else{
            pointsGainOrLoss = -1;
            TriviaDriver.streak = 0;
            TriviaDriver.totalPoints--;
            TriviaDriver.totalIncorrect++;
        }
        String str = "";
        str += "\n Points Gained:\t" + pointsGainOrLoss;
        str += "\n Total Points:\t" + TriviaDriver.totalPoints;
        str += "\n Current Streak:\t" + TriviaDriver.streak;
        str += "";
        System.out.println(str);

    }

    /**
     * takes in the file and creates question objects into the questionsArray as well as provide
     * letters to the correctAnswers array
     * @throws FileNotFoundException throws filenotfound exception
     */
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
                correctAnswers[i] = correctAnswer;
            }
        }
    }
}
