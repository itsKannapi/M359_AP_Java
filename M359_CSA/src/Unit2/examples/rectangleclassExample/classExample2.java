package Unit2.examples.rectangleclassExample;

public class classExample2 {

    private String brand;
    private int storage;
    private boolean service;

    public classExample2(String aBrand, int aStorage, boolean aService){
        brand = aBrand;
        storage = aStorage;
        service = aService;
    }
    public classExample2(String aBrand, int aStorage){
        brand = aBrand;
        storage = aStorage;
        service = true;
    }
    public void turnOnService(){
        service = true;
    }
    public void turnOffService(){
        service = false;
    }
    public void printPhoneDetails(){
        System.out.println("The brand name is " + brand);
        System.out.println("The storage amount is " + storage);
        System.out.println("Does it have service? " + service);
    }
    // short cut for println: "sout" and enter
    // shortcut for public static void main is psvm and enter

    public classExample2(){
    }
    // getter methods that allows us to return to value of the private instance variables to the user
    public String getBrand(){
        return brand;
    }
    public int getStorage(){
        return storage;
    }
    public boolean getService(){
        return service;
    }

    // setter methods allows us to change the value of the
    // private instance variables by the user
    //return type is always void
    //one parameter equal to the data type of the variable
    public void setBrand (String aBrand){
        brand = aBrand;
    }
    public void setStorage (int aStorage){
        storage = aStorage;
    }
    public void setService (boolean aService){
        service = aService;
    }

}
