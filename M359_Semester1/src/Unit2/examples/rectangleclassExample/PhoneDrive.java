package Unit2.examples.rectangleclassExample;

public class PhoneDrive {
    // shortcut for public static void main(String[] args) is psvm Enter

    public static void main(String[] args) {
        classExample2 p1 = new classExample2("Samsung", 16, false);
        classExample2 p2 = new classExample2("Apple", 32);
        classExample2 p3 = new classExample2("Google", 128);

        // method call is varName.methodName()
        // shortcut for System.out.println() is sout then Enter
        System.out.println();

        p3.printPhoneDetails();
        p3.turnOffService();

        p1.printPhoneDetails();
        p2.printPhoneDetails();

        p1.turnOnService();
        p1.printPhoneDetails();
    }
}
