package Unit7.examples;

import java.util.ArrayList;

public class Notes_7_1_7_2 {
    public static void main(String[] args) {
        //there is no initializer for ArrayLists
        ArrayList<String> names = new ArrayList<>();
        //adds element into the array
        names.add("Akshat");
        names.add("Ben");
        names.add("Colin");
        names.add("Denna");
        System.out.println(names.toString());
        //insert name "Amy" before Ben
        names.add(1,"Amy");
        System.out.println(names.toString());
        //remove name "Ben"
        String removedName = names.remove(2);
        System.out.println(removedName + " was removed");
        System.out.println(names.toString());
        // update or change Denna to say Mrs. Denna
        // can only set on an existing object
        names.set(3, "Mrs.Denna");
        System.out.println(names);
        names.add(names.remove(2));
        System.out.println(names);
    }
}