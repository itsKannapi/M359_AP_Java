package Unit9.Examples.Notes_9_3_9_4;

public class Circle extends Shape{
    private double radius = 0;

    public Circle(int numSides, String color, double radius){
        super(numSides, color);
        this.radius = radius;
    }
    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setVoid(Double r){
        radius = r;
    }

    @Override
    public String toString(){
        return super.toString() + " Circle has a radius of " + radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
