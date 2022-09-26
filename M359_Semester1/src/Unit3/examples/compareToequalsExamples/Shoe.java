package Unit3.examples.compareToequalsExamples;

public class Shoe {
    String brand;

    String style;

    double size;

    double price;

    public Shoe(String brand, String style, double size, double price) {
        this.brand = brand;
        this.style = style;
        this.size = size;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean equals(Shoe other){
        if (this.getBrand().equals(other.getBrand()) && this.getStyle().equals(other.getStyle())){
            return true;
        }
        else{
            return false;
        }
    }
    public int compareTo(Shoe other){
       double priceDiff = this.price - other.price;

       if (priceDiff < 0){
           return -1;
       }
       else if (priceDiff == 0){
           return 0;
       }
       else{
           return 1;
       }
    }
}
