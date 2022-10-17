package Unit4.examples;

public class DebuggerPractice {
    public static void main(String[] args) {
        int sum = 0;
        String name = "Shrek";
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        reverseString(name); // it will appear like nothing happened because we didn't save the value
                             // that was returned
        System.out.println(reverseString(name)); // here we print the value returned
    }

    public static String reverseString(String str){
        String revStr = "";

        for (int i = str.length() - 1; i >= 0; i--){
            revStr += str.charAt(i); // or str.substring (i, i + 1)
        }

        return revStr;
    }
}
