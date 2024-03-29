package Unit6.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) throws FileNotFoundException {
//        Course per1 = new Course("Anderson","AP Literature", "A-", 1);
//        Course per2 = new Course("Ganas","AP Psychology", "B", 2);
//        Course per3 = new Course("Denna","Ap Comp Sci A.", "B", 3);
//        Course per4 = new Course("Lunch", 4);
//        Course per5 = new Course("Kent","Intro to Econ.", "B", 5);
//        Course per6 = new Course("Brandenburg","Strength & Con", "A", 6);
//        Course per7 = new Course("Hochstetter","Calc for Bus & Soc Sci", "A-", 7);
//        Course per8 = new Course("Excused", 8);
//
//        Course[] courses = {per1, per2, per3, per4, per5, per6, per7, per8};
//
//        Student Joey = new Student("Joey",courses);
//        System.out.println(Joey);




        //Create a new file variable to open the file
        File file = new File("studentScheduleData.txt");
        Scanner inF = new Scanner(file);
        int numStudents = inF.nextInt();
        inF.nextLine();

        Student[] students = new Student[numStudents];
        int currStu = 0;

        while(inF.hasNextLine()){
            String name = inF.nextLine();
            Course[] allClasses = new Course[8];
            //use a  for loop to read in data for a Course 8 times
            for (int i = 0; i < allClasses.length; i++){
                //Read in teacher name, Course, grade, period
                String teacherName = inF.nextLine();
                String className = inF.nextLine();
                String grade = inF.nextLine();
                int per = inF.nextInt(); // only reads the int, does not go to the next line
                // need a dummy read to clear out the EOL character
                if (inF.hasNextLine()){
                    inF.nextLine();
                }

                //Create a Course var with this data
                Course c = new Course(teacherName, className, grade, per);
                //Save this course in the Course array
                allClasses[i] = c;
            }
            Student s = new Student(name, allClasses);
            students[currStu] = s;
            currStu++;
        }
        for (Student s: students) {
            if (s != null){
                System.out.println(s);
            }
        }
//        //Read in student name
//        String name = inSch.nextLine();
//        //Create a Course[] and instantiate it to be of size 8
//        Course[] allClasses = new Course[8];
//        //use a  for loop to read in data for a Course 8 times
//        for (int i = 0; i < allClasses.length; i++){
//            //Read in teacher name, Course, grade, period
//            String teacherName = inSch.nextLine();
//            String className = inSch.nextLine();
//            String grade = inSch.nextLine();
//            int per = inSch.nextInt(); // only reads the int, does not go to the next line
//            // need a dummy read to clear out the EOL character
//            if (inSch.hasNextLine()){
//                inSch.nextLine();
//            }
//
//            //Create a Course var with this data
//            Course c = new Course(teacherName, className, grade, per);
//            //Save this course in the Course array
//            allClasses[i] = c;
//        }
//        //create a student object with his name and Course[]
//
//        //print the student to see if it worked
//
//        //Create a Scanner to read data from the file
//        // Select the option to add the throws FileNotFoundException to the main header
//        Scanner inF = new Scanner(oneCourse);
//
//        //now we can call methods on the scanner object inF to read data
//        // .next() .nextLine() .nextInt() .hasNextLine() etc.
//
//        String teacherName = inF.nextLine();
//        String className = inF.nextLine(); //reads the ENTIRE LINE UNTIL THE END OF LINE CHAR
//        String grade = inF.nextLine();
//        int per = inF.nextInt();

//        //Create a course var with this data
//        Course c = new Course(teacherName, className, grade, per);
//        System.out.println(c);
//
//        Student s = new Student(name, allClasses);
//        System.out.println(s);



    }
}
