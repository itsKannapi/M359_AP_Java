package Unit9.Examples.Notes_9_3_9_4;

public class Square extends Rectangle{
    public Square (){
        super("None", 0.0, 0.0);
    }
    public Square(String color, double side){
        super(color, side, side);
    }

    @Override
    public String toString(){
        return super.toString() + " Square has a length of " + getWidth() + " and a length of " + getLength();
    }
}
