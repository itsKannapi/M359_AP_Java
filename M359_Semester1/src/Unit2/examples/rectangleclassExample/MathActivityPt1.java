package Unit2.examples.rectangleclassExample;

import java.util.Scanner;

/*
Joey Tamondong Period 3
Mrs. Denna
 */
public class MathActivityPt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1 = input.nextInt();
        System.out.println("Enter y1: ");
        int y1 = input.nextInt();
        System.out.println("Enter x2: ");
        int x2 = input.nextInt();
        System.out.println("Enter y2: ");
        int y2 = input.nextInt();

        double answer = (double) Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
        System.out.println("The distance between " + "(" + x1 + "," + x2 + ")" + answer);
    }
}
