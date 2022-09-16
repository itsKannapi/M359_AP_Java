package Unit2.examples.rectangleclassExample;

import java.util.Scanner;

/*
Joey Tamondong Period 3
Mrs. Denna
 */
public class MathActivityPt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a max value: ");
        int max = input.nextInt();
        System.out.println("Enter a min value: ");
        int min = input.nextInt();

        int randomInt = (int)(Math.random()* max - min) + min;
        System.out.println("The randomly generated value between " + min + " and " + max + " is: " + randomInt);
    }
}