package Unit7.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TicketMaster {
    private ArrayList<Show> allShows;
    //constructor
    public TicketMaster(){
        allShows = new ArrayList<>();
    }

    // to string that returns the entire arraylist
    public String toString(){
        String str = "Date" + "\t" + "Price" + "\t" + "Qty" + "\t" + "Performer" + "\n" + "City";
        str += "";
        return str;
    }
    public void showTxtFile () throws FileNotFoundException {
        File file = new File ("showData.txt");
        Scanner in
    }
    // void method to show data
    /*
    Scanner is called inF
    inF.nextLine() will read the entire rest of the line AND the EOL char
    inF.next() will read the text or num until the next space and return it
               as a string, this will NOT read the EOL char
    inF.nextInt() will read for the next int
    inF.nextDouble() will read for the next double
     */
    // when reading the file, make a method to find the coma in a line and then split the string

    // method to search by city and all shows in that city (arraylist of shows)

    // void method to sort by performer (selection sort)

    // void method to sort by price (insertion sort)


}
