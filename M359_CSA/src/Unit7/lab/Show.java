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

    /**
     * this method prints out an organized row of the performer's information
     * @return a row of shows that shows how information is organized
     */
    public String toString(){
        String str = date + "\t";
        str += price + "\t\t";
        str += Quantity + "\t\t";
        str += performer;
        for (int i = performer.length(); i < 18; i++){
            //subtract performer length from a certain number then spaces
            str += " ";
        }
        str += city;
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
