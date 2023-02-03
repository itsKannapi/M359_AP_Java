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

    /**
     * this method prints out all the shows in an organized manner
     */
    public void getShows(){
        System.out.println("Date" + "\t\t" + "Price" + "\t\t" + "Qty" + "\t\t" + "Performer" + "\t\t\t" + "City");
        System.out.println("-------------------------------------------------------------");
        for (Show s: allShows) {
            System.out.println(s);
        }
    }

    /**
     * this method prints out an organized row of the performer's information
     * @return a row of shows that shows how information is organized
     */
    public String toString(){
        String str = "Date" + "\t\t" + "Price" + "\t\t" + "Qty" + "\t\t" + "Performer" + "\t\t\t" + "City";
        str += "";
        return str;
    }

    /**
     * this method reads the text file, if it detects the fact that the file cannot be found,
     * an error message is displayed. Otherwise, it reads the entire line or text and creates
     * an object based on the line
     */
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

    /**
     * this method gets the shows from allShows and displays them based on the input
     *  of what city user provides
     */
    public void searchByCity (){
        ArrayList<Show> showsInstances = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a city to search shows in");
        String input = " " + in.nextLine();

        System.out.println("Shows Sorted By City");
        System.out.println("Date" + "\t\t" + "Price" + "\t\t" + "Qty" + "\t\t" + "Performer" + "\t\t\t" + "City");
        System.out.println("-------------------------------------------------------------");
        for (Show a: allShows){
            String city = a.getCity();
            if (city.equalsIgnoreCase(input)){
                showsInstances.add(a);
            }
        }
        for (Show s: showsInstances) {
            System.out.println(s);
        }

        if(showsInstances.size() == 0){
            System.out.println("Sorry, there are no shows available in that city!");
        }
    }
    /**
     * this method gets the shows from allShows and displayed them in order
     * (a-z) alphabetically based on the performer's name
     */
    public void searchByAtoZ(){
        for (int i = 0; i < allShows.size() - 1; i++){
            // start assuming i is the location of the smallest value
            int min = i; // this is the current position I am sorting
            for (int j = i + 1; j < allShows.size(); j++){
                // we are now checking the remaining values to see if they are smaller
                // than the value located at index min
                if(allShows.get(j).getPerformer().compareTo(allShows.get(min).getPerformer()) < 0){
                    min = j;
                }
            }
            // I now know that min has the index of the smallest value
            // swap the values from index i and index min
            Show temp = allShows.get(min);
            allShows.set(min, allShows.get(i));
            allShows.set(i, temp);
            }
        System.out.println("Shows sorted by A-Z");
        getShows();
    }
    /**
     * this method gets the shows from allShows and displayed them in order
     * (z-a) alphabetically based on the performer's name
     */
    public void searchByZtoA(){
        for (int i = 0; i < allShows.size() - 1; i++){
            // start assuming i is the location of the smallest value
            int min = i; // this is the current position I am sorting
            for (int j = i + 1; j < allShows.size(); j++){
                // we are now checking the remaining values to see if they are smaller
                // than the value located at index min
                if(allShows.get(j).getPerformer().compareTo(allShows.get(min).getPerformer()) > 0){
                    min = j;
                }
            }
            // I now know that min has the index of the smallest value
            // swap the values from index i and index min
            Show temp = allShows.get(min);
            allShows.set(min, allShows.get(i));
            allShows.set(i, temp);
        }
        System.out.println("Shows sorted from Z-A");
        getShows();
    }
    /**
     * this method gets the shows from allShows and displayed the in order
     * based on the price of the tickets from lowest to highest
     */
    public void sortLowToHigh(){
        for (int i = 1; i < allShows.size(); i++){
            Show valueToInsert = allShows.get(i);
            int position = i;

            while(position > 0 && allShows.get(position - 1).getPrice() > valueToInsert.getPrice()){
                //shift the value at position - 1 over to position
                allShows.set(position, allShows.get(position - 1));
                //decrease position so I can continue checking values
                position--;
            }

            //at this point, I have either checked all values and I belong at position
            //0 (so first check of whule loop failed) OR i am larger than the next element,
            // so I found where I belong, at position

            // now, you set the value at index positon with the value we saved in valueToInsert
            allShows.set(position, valueToInsert);
        }
        System.out.println("Shows sorted from low to high in Ticket price");
        getShows();
    }
    /**
     * this method gets the shows from allShows and displayed the in order
     * based on the price of the tickets from highest to lowest
     */
    public void sortHighToLow(){
        for (int i = 1; i < allShows.size(); i++){
            Show valueToInsert = allShows.get(i);
            int position = i;

            while(position > 0 && allShows.get(position - 1).getPrice() < valueToInsert.getPrice()){
                //shift the value at position - 1 over to position
                allShows.set(position, allShows.get(position - 1));
                //decrease position so I can continue checking values
                position--;
            }

            //at this point, I have either checked all values and I belong at position
            //0 (so first check of whule loop failed) OR i am larger than the next element,
            // so I found where I belong, at position

            // now, you set the value at index positon with the value we saved in valueToInsert
            allShows.set(position, valueToInsert);
        }
        System.out.println("Shows sorted from high to low in Ticket price");
        getShows();
    }
}

