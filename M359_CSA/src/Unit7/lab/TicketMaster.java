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
    public void getShows(){
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
    public void searchByCity (){
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
        getShows();
    }

    // void method to sort by performer (selection sort)
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
        getShows();
    }
    // void method to sort by price (insertion sort)
    public void sortLowToHigh(){
        for (int i = 1; i < allShows.size(); i++){
            Show valueToInsert = allShows.get(i);
            int position = i;

            while(position > 0 && allShows.get(position - 1).getPrice() > allShows.get(position).getPrice()){
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
        getShows();
    }
//    public void sortHighToLow(){
//
//    }
}

