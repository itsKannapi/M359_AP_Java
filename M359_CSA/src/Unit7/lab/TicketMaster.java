package Unit7.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private static ArrayList<Show> allShows;
    //constructor
    public TicketMaster(){
        allShows = new ArrayList<>();
    }
    public static void getShows(){
        for (Show s: allShows) {
            System.out.println(s);
        }
    }
    // to string that returns the entire arraylist
    public String toString(){
        String str = "Date" + "\t\t" + "Price" + "\t\t" + "Qty" + "\t\t" + "Performer" + "\t\t\t" + "City";
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
            String inputLine = in.nextLine();
            String[] arrOfStr = inputLine.split(",");

            String newLine = arrOfStr[0];
            String city = arrOfStr[1];

            String[] newArrOfStr = newLine.split(" ");
            String date = newArrOfStr[0];
            double price = Double.parseDouble(newArrOfStr[1]);
            int quantity = Integer.parseInt(newArrOfStr[2]);
            String performer = newArrOfStr[3];
            if (newArrOfStr.length > 4){
                performer += " " + newArrOfStr[4];
            }
            if (newArrOfStr.length > 5) {
                performer += " " + newArrOfStr[5];
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
    // method to search by city and all shows in that city (arraylist of shows)
    public static void searchByCity (){
        ArrayList<Show> showsInstances = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a city to search shows in");
        String input = " " + in.nextLine();

        for (Show a: allShows){
            String city = a.getCity();
            if (city.equalsIgnoreCase(input)){
                showsInstances.add(a);
            }
        }
        for (Show s: showsInstances) {
            System.out.println(s);
        }
    }
    // void method (a-z)
    // use a compare to method (ASCII)
    public static void searchByAtoZ(){
        ArrayList<Show> showsInstances = new ArrayList<>();
        for (int i = 0; i < allShows.size(); i++){
            String dateOne = allShows.get(i).getDate();
            String dateTwo = allShows.get(i + 1).getDate();

            int result = dateOne.compareTo(dateTwo);
            

        }
    }

    // void method to sort by performer (selection sort)

    // void method to sort by price (insertion sort)


}
