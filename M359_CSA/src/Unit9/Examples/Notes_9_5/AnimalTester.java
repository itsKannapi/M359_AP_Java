package Unit9.Examples.Notes_9_5;

/**
* Lesson 9-5: Polymorphism
 * The purpose of this tester class is to see what happens when an array
 * of Animal references is assigned objects of type Animal, Pig, and Cow
 * 
 * @author   Mrs. Denna 
 */
public class AnimalTester
{
   public static void main(String[] args)
   {
       Animal[] barn = new Animal[6];
       // 1. What data type does this array hold?
       // it holds the objects from the Animal class

       barn[0] = new Animal("Murphy");
       barn[1] = new Cow("Daisy", "Dairy");
       barn[2] = new Pig("Wilbur", false);
       barn[3] = new Cow("Billy", "Beef");
       barn[4] = new Animal("Maggie");
       barn[5] = new Pig("Max", true);

       Cow dairyCow = new Cow("Milk Cow", "Dairy");
       Cow beefCow = new Cow ("Beef Cow", "Beef");
       Animal someCow = new Cow("Random Cow", "Dairy");

       dairyCow.milkCow();
       beefCow.milkCow();
       // someCow.milkCow()
       // ^^super classes cannot access the objects/methods that are found^^
       //   in the subclass
       //
       //   therefore, it will not work because ALL animals do not have a milkCow
       //   method, since we know that someCow is really a cow, we can cast it as cow
       //   and then java calls methods that are only defined for cow objects
       ((Cow)someCow).milkCow();
       // instead, we ust put the class we are casting it to in parenthesis
       // before the dot method so that Java will think of it as a Cow and allow us
       // to call that method
       // performing a cast does NOT change the type of the reference, someCow
       // is still an Animal reference

       //Cow newCow = someCow;
       // this will not work: even though someCow is a cow, java will only reference it as
       // an animal, if we wanted to save that as a cow, we need to save it to a ref var
       Cow newCow = (Cow)someCow;

       if (someCow instanceof Cow){
           ((Cow) someCow).milkCow();
       }
       // 2. Did I ONLY store Animal objects in this array?  If not, why do you
       //    think this was allowed?
       // no because we added the cow and pig classes
       // the cow and pig classes are subclasses and inherit the same variables from
       // animal
   
       for (Animal a: barn) {
           a.speak();
           if (a instanceof Cow) {
               ((Cow) a).milkCow();
           }
       }
            // 3. What method is getting called here?  The speak method of the Animal class?
            // it is calling the speak method found in the classes that is overridden by the specific animal class
       // 4. Try to summarize in 2-3 sentences WHAT you observed in this code.
       // in this tester program, this code creates animal objects and stores them into an array.
       // then the code prints out what sound the animal makes.
   }
   
}
