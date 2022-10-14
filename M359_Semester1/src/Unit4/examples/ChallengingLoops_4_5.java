package Unit4.examples;

public class ChallengingLoops_4_5 {
    public static void main(String[] args) {
        // Challenge #1
        for (int i = 5; i > 0; i--){
            for (int k = 1; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("\n");
        // Challenge #2
        for (int i = 5; i > 0; i--){
            for (int k = i; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
