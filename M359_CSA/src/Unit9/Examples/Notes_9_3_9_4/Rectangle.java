package Unit9.Examples.Notes_9_3_9_4;

public class Rectangle extends Shape{
    private double width = 0;
    private double length = 0;

    public Rectangle(String color, double width, double length){
        super(4, color);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double w){
        width = w;
    }
    public void setLength(double l){
        length = l;
    }
}
