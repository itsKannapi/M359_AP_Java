package Unit7.examples;

import java.util.ArrayList;
/*
 This algorithm was taught in vl
 */
public class Selection_Sort_Notes {
    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<>();
        myNums.add(3);
        myNums.add(1);
        myNums.add(0);
        myNums.add(4);
        myNums.add(4);
        myNums.add(1);
        myNums.add(7);

        //Selection sort
        //outer loop from 0 to size() - 1
            //set min index = this index
            //inner loop from outerloop + 1 to size()
                //update min index as needed
        //swap min index with outer loop index

        for (int i = 0; i < myNums.size() - 1; i++){
            // start assuming i is the location of the smallest value
            int min = i; // this is the current position I am sorting
            for (int j = i + 1; j < myNums.size(); j++){
                // we are now checking the remaining values to see if they are smaller
                // than the value located at index min
                if(myNums.get(j) < myNums.get(j)){
                    min = j;
                }
            }
            // I now know that min has the index of the smallest value
            // swap the values from index i and index min
            int temp = myNums.get(min);
            myNums.set(min, myNums.get(i));
            myNums.set(i, temp);
        }

        System.out.println(myNums);
    }
}
