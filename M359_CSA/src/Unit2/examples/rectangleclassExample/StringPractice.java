package Unit2.examples.rectangleclassExample;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        String course = "AP Java - CSA";
        String school = "Fremd High School";
        String teacherName;

        // find first occurrence of "a" in course and print out the result
        System.out.println(course.indexOf("a"));
        // find first occurrence of "a" in school and print out the result
        System.out.println(school.indexOf("a"));
        // how would you extract the string "md H" from school?
        System.out.println(school.substring(3, 7));
        // how would you extract the string CSA from course?
        System.out.println(course.substring(10, 13));
        System.out.println(course.substring(10));
        // This can be done TWO ways - can you figure out both?

        // how can we print out FREMD HIGH SCHOOL

        //** BONUS **//

        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Read in the teacher name as two words with a space in between them
        System.out.println("Enter your full name with a space in between names");
        teacherName = input.nextLine();
        int spaceLocation = teacherName.indexOf(" ");
        String newName = teacherName.substring(0, spaceLocation) + teacherName.substring(spaceLocation+1);
        // using TWO lines of code, display the teacher name as ONE word, without a space
        System.out.println(newName);
    }
}
