// Joey and Colin
package Unit9.Lab;

public class Athlete{
    private String name;
    private int totalPoints;
    private int timePlayed;
    private String sportPlayed;
    private int percentage = 0;

    /**
     * Basic constructor for the Athlete superclass..
     * @param name is the name of the Athlete and set to the name String variable.
     * @param totalPoints is the total points of the Athlete and is set to the int totalPoints.
     * @param timePlayed is the total time played for the Athlete and is set to the double timePlayed.
     * @param sportPlayed is the name of the sport the Athlete plays and is set to the String sportPlayed.
     */
    public Athlete(String name, int totalPoints, int timePlayed, String sportPlayed) {
        this.name = name;
        this.totalPoints = totalPoints;
        this.timePlayed = timePlayed;
        this.sportPlayed = sportPlayed;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints += totalPoints;
    }

    public double getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(double timePlayed) {
        this.timePlayed += timePlayed;
    }

    public String getSportPlayed() {
        return sportPlayed;
    }

    public void setSportPlayed(String sportPlayed) {
        this.sportPlayed = sportPlayed;
    }

    // ask mrs.denna about using a simulate game
    // returns a percentage

    /**
     * A method that sets the variable "percentage" to a random number 1-100.
     */
    public void simulateGame(){
        percentage = (int) (Math.random() * 100);
    }

    /**
     * A basic custom toString that prints the data of the superclass Athlete.
     * @return - returns a String
     */
    public String toString(){
        return name + " plays " + sportPlayed + " and scored " + totalPoints + " in " + timePlayed + " minutes.";
    }
}