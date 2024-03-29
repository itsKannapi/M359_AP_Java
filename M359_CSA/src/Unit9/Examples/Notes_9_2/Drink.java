package Unit9.Examples.Notes_9_2;

public class Drink extends MenuItem{
    private int numOz;
    private boolean isFrozen;

    public Drink(String name, int numOz) {
        super(name);
        this.numOz = numOz;
        this.isFrozen = false;
        System.out.println(getName() + " holds " + numOz + " ounces");
    }

    public Drink(String name, int numOz, boolean isFrozen) {
        super(name);
        this.numOz = numOz;
        this.isFrozen = isFrozen;
        if (isFrozen) {
            System.out.println("This frozen drink holds " + numOz + " ounces");
        }
        else {
            System.out.println("This drink holds " + numOz + " ounces");
        }
    }

}
