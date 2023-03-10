package Unit9.Lab;

public class Athlete{
    private String name;
    private int totalPoints;
    private double timePlayed;
    private String sportPlayed;
    

    public Athlete(String name, int totalPoints, double timePlayed, String sportPlayed){
        this.name = name;
        this.totalPoints = totalPoints;
        this.timePlayed = timePlayed;
        this.sportPlayed = sportPlayed;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public String getSportPlayed() {
        return sportPlayed;
    }

    public void setSportPlayed(String sportPlayed) {
        this.sportPlayed = sportPlayed;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public double getTimePlayed() {
        return timePlayed;
    }

    //ask mrs.denna about using a simulate game
    // returns a percentage
    public int simulateGame(){
        return (int) (Math.random() * 100);
    }

    public void setTimePlayed(int timePlayed) {
        this.timePlayed = timePlayed;
    }
    public String toString(){
        return name + " plays " + sportPlayed + " and scored " + totalPoints + " points in " + timePlayed + " minutes.";
    }
}
