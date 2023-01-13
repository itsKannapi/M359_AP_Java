package Unit7.lab;

public class Show {
    private final String date;
    private final double price;
    private final int Quantity;
    private final String performer;
    private final String city;
    //constructor

    public Show(String date, double price, int quantity, String performer, String city) {
        this.date = date;
        this.price = price;
        Quantity = quantity;
        this.performer = performer;
        this.city = city;
    }

    //toString Method in a row format and columns
    public String toString(){
        String str = date + "\t" + price + "\t" + Quantity + "\t" + performer + "\t" + city;
        return str;
    }
    //get/set methods

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getPerformer() {
        return performer;
    }

    public String getCity() {
        return city;
    }
}
