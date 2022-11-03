package Unit5.Lab;

public class HockeyTester {
    // skill range is from 0-100 (most pro teams 70-100)
    public static void main(String[] args) {
        Team ChicagoBlackhawks = new Team("Chicago Blackhawks", "West", 50, 50);
        System.out.println(ChicagoBlackhawks);
        Team TampaBayLightning = new Team ("Tampa Bay Lightning", "East", 50, 50);
        System.out.println(TampaBayLightning);

        System.out.println();

        // simulates a single game
        games(ChicagoBlackhawks, TampaBayLightning, 1);

        System.out.println();

        // simulates a playoff series
        games(ChicagoBlackhawks, TampaBayLightning, 7);
    }

    /**
     * this method  gets the offensive and defensive power of either teams
     * and create an overall power assessment of either team
     *
     * @param team team one's attributes
     */
    // Determines the overall power of a team
    public static double overallPower(Team team){
        int teamDPower = team.getTeamSkill().getDefensivePower(); // Defensive power variable
        int teamOPower = team.getTeamSkill().getOffensivePower(); // Offensive power variable


        double teamOverallPower =  (((double)teamDPower + teamOPower) / 2);
        // Overall Power of team is equal to the defensive power and offensive power combined,
        // then divided by 2.

        return teamOverallPower;
    }

    /**
     * this method will simulate a hockey game (or series depending on the numGames)
     * depending on the overall power between the two and a chancing simulator between the two
     *
     * @param team1 team one
     * @param team2 team two
     * @param numGames amount of games that will be played
     */
    // To Do: add an if statement determining if one skill is greater than the other add a standings (W-L counter in simulated games)
    public static void games(Team team1, Team team2, int numGames){
        final int numFinalGames = numGames;
        final double winPercentage = .70;
        int teamOneWinCounter = 0;
        int teamTwoWinCounter = 0;
        while (numGames > 0){
            double winningNumber = Math.random();
            if (overallPower(team1) > overallPower(team2)){ // team1 has more overall power than team2
            /*
            logic: the team that has overall higher strength has an 70% chance of winning a game
            the team with lower strength would then have a 30% chance of winning the game
             */
                // team one won
                if (winningNumber < winPercentage){
                    System.out.println(team1.getTeamName() + " Has won the game!");
                    teamOneWinCounter += 1;
                    System.out.println("Series: " + team1.getTeamName() + " " + teamOneWinCounter
                            + " - " + team2.getTeamName() + " " + teamTwoWinCounter);
                }
                // team two won
                else {
                    System.out.println(team2.getTeamName() + " Has won the game!");
                    teamTwoWinCounter += 1;
                    System.out.println("Series: " + team1.getTeamName() + " " + teamOneWinCounter
                            + " - " + team2.getTeamName() + " " + teamTwoWinCounter);
                }
            }
            else if (overallPower(team1) == overallPower(team2)){
            /*
            logic: When the over power of the teams are equal to each other it is a 50/50
            for who will win.
             */
                if (winningNumber < .50){  // If statement to determine the 50/50 winner of the game
                    System.out.println(team1.getTeamName() + " has won the game.");
                    teamOneWinCounter += 1;
                    System.out.println("Series: " + team1.getTeamName() + " " + teamOneWinCounter
                            + " - " + team2.getTeamName() + " " + teamTwoWinCounter);
                }
                else {
                    System.out.println(team2.getTeamName() + " has won the game.");
                    teamTwoWinCounter += 1;
                    System.out.println("Series: " + team1.getTeamName() + " " + teamOneWinCounter
                            + " - " + team2.getTeamName() + " " + teamTwoWinCounter);
                }
            }
            else{ // team one has less strength
                double winChance = Math.random();
                if (winChance > winPercentage){ // team one wins
                    System.out.println(team1.getTeamName() + " Has won the game!");
                    teamOneWinCounter += 1;
                    System.out.println("Series: " + team1.getTeamName() + " " + teamOneWinCounter
                            + " - " + team2.getTeamName() + " " + teamTwoWinCounter);
                }
                else{
                    System.out.println(team2.getTeamName() + " Has won the game!");
                    teamTwoWinCounter += 1;
                    System.out.println("Series: " + team1.getTeamName() + " " + teamOneWinCounter
                            + " - " + team2.getTeamName() + " " + teamTwoWinCounter);
                }

            }
            numGames--;
        }
        // ADD COMMENTS HERE

        String winnerOfSeries = "";
        String loserOfSeries = "";
        int winCount = 0;
        if (teamOneWinCounter > teamTwoWinCounter){
            winnerOfSeries = team1.getTeamName();
            loserOfSeries = team2.getTeamName();
            winCount = teamOneWinCounter - teamTwoWinCounter;
            System.out.println("After " + numFinalGames + " games, the " + winnerOfSeries + " has won " + winCount +
                    " more games than the " + loserOfSeries);
        }
        else if (teamOneWinCounter == teamTwoWinCounter) {
            winnerOfSeries = "Tie Series";
            System.out.println(team1 + " has tied with " + team2 + " after " + numFinalGames + " games.");
        }
        else {
            winnerOfSeries = team2.getTeamName();
            loserOfSeries = team1.getTeamName();
            winCount = teamTwoWinCounter - teamOneWinCounter;
            System.out.println("After " + numFinalGames + " games, the " + winnerOfSeries + " has won " + winCount +
                    " more games than the " + loserOfSeries);
        }
    }
}
