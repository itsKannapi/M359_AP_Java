package Unit7.examples.Notes_7_5_Examples;

import java.util.ArrayList;

public class Insertion_Sort_Notes {
    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<>();
        myNums.add(3);
        myNums.add(1);
        myNums.add(0);
        myNums.add(4);
        myNums.add(4);
        myNums.add(1);
        myNums.add(7);
        System.out.println(myNums);

        for (int i = 1; i < myNums.size(); i++){
            int valueToInsert = myNums.get(i);
            int position = i;

            while(position > 0 && myNums.get(position - 1) > valueToInsert){
                //shift the value at position - 1 over to position
                myNums.set(position, myNums.get(position - 1));
                //decrease position so I can continue checking values
                position--;
            }

            //at this point, I have either checked all values and I belong at position
            //0 (so first check of whule loop failed) OR i am larger than the next element,
            // so I found where I belong, at position

            // now, you set the value at index positon with the value we saved in valueToInsert
            myNums.set(position, valueToInsert);
        }
        System.out.println(myNums);
    }
}
