package Unit9.Examples.Notes_9_5;

public class Cow extends Animal
{
    private String cowType;                     // Dairy or Beef
    
    public Cow(String name, String cowType)
    {
        super(name);
        this.cowType = cowType;
    }

    /**
     * Makes a sound for a cow
     * 
    */
    public void speak()
    {
        System.out.println("The "+ cowType + " Cow " + getName() + " says MOOOOO.");
    }
    public void milkCow(){
        if(cowType.equals("Dairy")){
            System.out.println("We got fresh milk");
        }
        else{
            System.out.println("you can't milk a beef cow! xD");
        }
    }
}
