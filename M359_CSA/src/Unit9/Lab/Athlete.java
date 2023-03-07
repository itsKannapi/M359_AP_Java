package Unit9.Lab;

public class Athlete{
    private String name;
    private int totalPoints;
    private int timePlayed;
    private String sportPlayed;

    public Athlete(String name, int totalPoints, int timePlayed, String sportPlayed){
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

    public int getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(int timePlayed) {
        this.timePlayed = timePlayed;
    }
    public String toString(){
        return name + " plays " + sportPlayed + " and scored " + totalPoints + " in " + timePlayed;
    }
}
