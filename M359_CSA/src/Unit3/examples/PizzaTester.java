package Unit3.examples;

/**
 * This class will test our pizza code.
 * It will contain the main method
 *
 * shortcut:psvm
 */
public class PizzaTester {
    public static void main(String[] args) {
        Pizza dd = new Pizza("Lou Malnatis",  12,  2,  true);
        Pizza thin = new Pizza("Dominoes",  16,  3,  false);
        Pizza thinCheese = new Pizza("Papa Johns",  14, false);

        System.out.println(dd);
        System.out.println(thin);
        System.out.println(thinCheese);
    }
}
