package Unit7.lab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    private static final int SEARCH = 1;
    private static final int AtoZ = 2;
    private static final int ZtoA = 3;
    private static final int LOW_TO_HIGH_PRICE = 4;
    private static final int HIGH_TO_LOW_PRICE = 5;
    private static final int QUIT = 6;
    private static boolean continuation = true;

    // provide a menu of choices and users select a choice to sort
    // a-z, z-a, sort by ticket price low-high/high-low,
    // search by city, or quit
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster shows = new TicketMaster();
        shows.showTxtFile();
        Scanner Input = new Scanner(System.in);
        int choice = 0;

        System.out.println("          ****  Welcome to Ticket Master Kiosk  ****          ");
        System.out.println("You may search out shows by city as well as sort the shows by performer and ticket price.");
        System.out.println("Simply select the correct option corresponding with your choice");

        while (continuation) {
            System.out.println("1. Search by City");
            System.out.println("2. Sort by Performer (A-Z)");
            System.out.println("3. Sort by Performer (Z-A)");
            System.out.println("4. Sort by Price (low-high)");
            System.out.println("5. Sort by Price (high-low");
            System.out.println("6. Quit");
            System.out.println();

            choice = getNextIntVal(Input, 1, 6);
            if (choice == SEARCH){
                shows.searchByCity();
                System.out.println();
            }
            if (choice == AtoZ){
                System.out.println("You've selected option 2");
                shows.searchByAtoZ();
                System.out.println();
            }
            if (choice == ZtoA){
                System.out.println("You've selected option 3");
                shows.searchByZtoA();
                System.out.println();
            }
            if (choice == LOW_TO_HIGH_PRICE){
                System.out.println("You've selected option 4");
                shows.sortLowToHigh();
                System.out.println();
            }
            if (choice == HIGH_TO_LOW_PRICE){
                System.out.println("You've selected option 5");
                shows.sortHighToLow();
                System.out.println();
            }
            if (choice == QUIT){
                continuation = false;
            }
        }
    }
    public static int getNextIntVal(Scanner in, int min, int max){
        boolean keepGoing = true;
        int num = 1;
        while(keepGoing){
            try {
                System.out.println("Enter a Value between 1 and 6");
                num = in.nextInt();
                if (num >= min && num <= max) {
                    keepGoing = false;
                    return num;
                } else {
                    System.out.println("Error: That is not a valid integer!");
                    System.out.println();
                }

            }
            catch (Exception e){
                System.out.println("Error: Invalid Input, please enter an int");
                System.out.println();
                in.nextLine();
            }
        }
        return -1;
    }
}
