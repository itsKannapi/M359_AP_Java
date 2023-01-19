package Unit7.lab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    // provide a menu of choices and users select a choice to sort
    // a-z, z-a, sort by ticket price low-high/high-low,
    // search by city, or quit
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster shows = new TicketMaster();
        shows.showTxtFile();

        System.out.println("          ****  Welcome to Ticket Master Kiosk  ****          ");
        System.out.println("You may search out shows by city as well as sort the shows by performer and ticket price.");
        System.out.println("Simply select the correct option corresponding with your choice");
        //Scanner input = new Scanner(System.in);
        System.out.println(shows);
        TicketMaster.getShows();
    }
    // if they don't pick options 1-6 they are prompted to enter a
    // correct option

    //create constraints equal to the int values 1-6
}
