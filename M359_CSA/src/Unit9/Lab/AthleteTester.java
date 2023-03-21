// Joey and Colin
package Unit9.Lab;

import java.util.ArrayList;

public class AthleteTester {
    public static void main(String[] args) {
        // what our driver does:
        /*
        we have the array list of athletes ranging from all different sports, and we keep track of how many
        total points each player(s) have in each sport with the specific points after a simulated "season".
        Then we print out the player(s) data at the end of the "season" they played.
         */
        ArrayList<Athlete> athletes = new ArrayList<Athlete>();
        final int min = 1;
        final int max = 10;
        final int range = max - min + 1;

        Athlete Nadal = new Athlete("Michael",0,0,"Tennis");
        athletes.add(Nadal);
        Athlete Williams = new Athlete("Williams",0,0,"Tennis");
        athletes.add(Williams);

        Athlete Jack = new Hockey("Jack",0,0, 0,0,0);
        athletes.add(Jack);
        Athlete Connor = new Hockey("Connor",0,0, 0,0,0);
        athletes.add(Connor);


        Athlete MJ = new Basketball("MJ", 0,0,0,0,0,0);
        athletes.add(MJ);
        Athlete KB = new Basketball("KB", 0,0,0,0,0,0);
        athletes.add(KB);

        Athlete DJM = new Football("DJM",0,0,0,0);
        athletes.add(DJM);
        Athlete JF = new Football("JF",0,0,0,0);
        athletes.add(JF);

        // simulate a season for loop
        for(Athlete a: athletes){
            int numSimGame = (int) ((Math.random() * range) + min);
            for (int i = 0; i < numSimGame; i++){
                a.simulateGame();
            }
            System.out.println(a);
            if (a.getTotalPoints() > 0 || a.getTimePlayed() > 0)
                System.out.println(a.getName() + " played " + numSimGame + " games.");
            else
                System.out.println(a.getName() + " has not played a game yet.");
            System.out.println();
        }
    }
}