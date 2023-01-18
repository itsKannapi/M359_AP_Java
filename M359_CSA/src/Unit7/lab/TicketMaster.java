package Unit7.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private final ArrayList<Show> allShows;
    //constructor
    public TicketMaster(){
        allShows = new ArrayList<>();
    }

    // to string that returns the entire arraylist
    public String toString(){
        String str = "Date" + "\t" + "Price" + "\t" + "Qty" + "\t" + "Performer" + "\t" + "City";
        str += "";
        return str;
    }
    public void showTxtFile () {
        File file = new File ("showData.txt");
        Scanner in = null;
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Cannot find text file");
        }

        while(in != null && in.hasNextLine()){
            String date = in.next();
            double price = in.nextDouble();
            int quantity = in.nextInt();
            String performer = in.next();
            String city;
            if (performer.contains(",")){
                //performer.replace(',',' ');
                city = " " + in.next();
            }
            else{
                performer += in.next();
                //performer.replace(',',' ');
                city = in.next();
            }
            String secondWord = "";
            if (!in.next().equals("")){
                city += in.next();
            }

            Show s = new Show(date, price, quantity, performer, city);
            allShows.add(s);
        }
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
