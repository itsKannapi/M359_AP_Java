// Joey and Colin
package Unit9.Lab;

public class AthleteTester {
    public static void main(String[] args) {
        // what our driver does:
        /*
        we have the array list of athletes ranging from all different sports and we keep track of how many
        total points each player(s) have in each sports with the specific points after a simulated "season"
         */
        Athlete michael = new Athlete("Michael",15,10,"Tennis");
        System.out.println(michael);

        Athlete Jack = new Hockey("Jack",50,90, "Hockey",
                20,30,4);
        System.out.println(Jack);

        Athlete MJ = new Basketball("MJ", 34,20,5,7,6,2);
        System.out.println(MJ);

        System.out.println();
        //simulate game method
                // method where the if the percentage in the athlete class higher than a percentage
                // it would then add one to any of the variables if applies to
                // example: if % returned in athlete > 80 (80% for goals): add one to goals (applies to all stats));
    }
}
