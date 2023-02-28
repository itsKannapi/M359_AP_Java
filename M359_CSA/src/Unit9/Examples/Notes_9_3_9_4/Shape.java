package Unit9.Examples.Notes_9_3_9_4;

public class Shape {
    private int numSides = 0;
    private String color = "";

    public Shape(int numSides, String color){
        this.numSides = numSides;
        this.color = color;
    }

    public int getNumSides(){
        return numSides;
    }
    public String getColor(){
        return color;
    }
    public void setNumSides(int n){
        numSides = n;
    }
    public void setColor(String s){
        color = s;
    }
}
