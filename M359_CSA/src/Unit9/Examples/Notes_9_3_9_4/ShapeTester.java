package Unit9.Examples.Notes_9_3_9_4;

public class ShapeTester {
    public static void main(String[] args){
        Shape myShape = new Shape (12, "Red");
        Circle cubsLogo = new Circle (4, "Blue");
        Rectangle billBoard = new Rectangle("Yellow",100,40);
        Square keyCaps = new Square("Grey",2.1);

        System.out.println(myShape);
        System.out.println(cubsLogo);
        System.out.println(billBoard);
        System.out.println(keyCaps);
    }
}