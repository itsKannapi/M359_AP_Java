package Unit5.Lab;

public class HockeyTester {
    // skill range is from 0-100 (most pro teams 70-100)
    public static void main(String[] args) {
        Team ChicagoBlackhawks = new Team("Chicago Blackhawks", "West", 75, 85);
        System.out.println(ChicagoBlackhawks);
        Team TampaBayLightning = new Team ("Tampa Bay Lightning", "East", 85, 90);
        System.out.println(TampaBayLightning);

        // simulates a single game
        games(ChicagoBlackhawks, TampaBayLightning, 1);

        // simulates a playoff series
        games(ChicagoBlackhawks, TampaBayLightning, 7);
    }

    /**
     * this method  gets the offensive and defensive power of either teams
     * and create an overall power assessment of either team
     *
     * @param team team one's attributes
     */
    public static double overallPower(Team team){
        int teamPower = team.getTeamSkill().getDefensivePower();
        int teamPower2 = team.getTeamSkill().getOffensivePower();


        double team1OverallPower =  (((double)teamPower + teamPower2) / 2);
        // Overall Power of team is equal to the defensive power and offensive power combined,
        // then divided by 2.

        return team1OverallPower;
    }

    /**
     * this method will simulate a hockey game (or series depending on the numGames)
     * depending on the overall power between the two and a chancing simulator between the two
     *
     * @param team1 team one
     * @param team2 team two
     * @param numGames amount of games that will be played
     */
    // To Do: add and if statement determining if one skill is greater than the other add a standings (W-L counter in simulated games)
    public static void games(Team team1, Team team2, int numGames){

    }
}
