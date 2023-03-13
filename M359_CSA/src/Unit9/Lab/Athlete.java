// Joey and Colin
package Unit9.Lab;

public class Athlete{
    private String name;
    private int totalPoints;
    private double timePlayed;
    private String sportPlayed;

    private int percentage = 0;

    public Athlete(String name, int totalPoints, double timePlayed, String sportPlayed) {
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
        this.timePlayed = timePlayed;
    }

    public String getSportPlayed() {
        return sportPlayed;
    }

    public void setSportPlayed(String sportPlayed) {
        this.sportPlayed = sportPlayed;
    }

    public void simulateGame(){
        percentage = (int) (Math.random() * 100);
    }
    public String toString(){
        return name + " plays " + sportPlayed + " and scored " + totalPoints + " in " + timePlayed + " minutes.";
    }
}
