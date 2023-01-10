package Unit4.examples;

import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        System.out.println("Enter an int: (-999 to quit)");
        int value = input.nextInt();
        while (value != -999) {
            sum += value;

            count++;
            System.out.println("Enter an int: (-999 to quit)");
            value = input.nextInt();
        }

        // calculate the average
        double avg = (double)sum/count;
        // print it all out
        System.out.println("The average is: " + avg);
    }
}
