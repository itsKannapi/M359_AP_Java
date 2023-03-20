// Joey and Colin
package Unit9.Lab;

public class Hockey extends Athlete{
    private int goals;
    private int assists;
    private int penalties;

    /**
     * Basic Constuctor for the Hockey Class
     * @param name returns name of athlete
     * @param totalPoints returns total points scored by the athlete
     * @param timePlayed returns the time played
     * @param goals returns the amount of the goals the player scores
     * @param assists returns the amount of assists the player scores
     * @param penalties returns the penalty minutes a players gets
     */
    public Hockey(String name, int totalPoints, int timePlayed, int goals, int assists, int penalties) {
        super(name, totalPoints, timePlayed, "Hockey");
        this.goals = goals;
        this.assists = assists;
        this.penalties = penalties;

    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }

    /**
     * simulateGame() method
     * runs the simulateGame() from the super athlete class and returns
     * the percentage found from the athlete class
     * and sets it as one only accessible in the method.
     * then it also makes a randomized percentage for the penalties that
     * is only specific to this class. this runs x amount of times found in AthleteTester
     *
     * if the percentage is above 70, the player gets added an assist and totalpoints is added one
     * and if the percentage is above 80, the player also gets added a goal and the totalpoints is added one
     *
     * for penalties
     * if the percentage is 10, the player gets 10 mins added
     * if the percentage is 5, the player gets 5 mins added
     * if the percentage is 2, the player gets 2 mins added
     *
     * otherwise, 60 minutes gets added to their total minutes played
     *
     * This method overrides the superclass method simulateGame()
     */
    @Override
    public void simulateGame(){
        super.simulateGame();
        int percentage = super.getPercentage();
        int penaltyMinProbability = (int) (Math.random() * 10);

        if (percentage >= 70){
            assists++;
            setTotalPoints(1);
            if (percentage >= 80){
                goals++;
                setTotalPoints(1);
            }
        }
        if (penaltyMinProbability == 10){
            penalties = penalties + penaltyMinProbability;
        }
        else if (penaltyMinProbability == 5){
            penalties = penalties + penaltyMinProbability;
        }
        else if (penaltyMinProbability <= 2){
            penalties = penalties + penaltyMinProbability;
        }
        super.setTimePlayed(60);
    }

    /**
     * A basic custom toString that prints the data of the subclass Hockey
     * @return - returns a string
     */
    public String toString(){
        return super.toString() + "\n" + getName() + " has " +  goals + " goal(s) and " + assists + " assist(s) with "
                + penalties + " penalties";
    }
}
