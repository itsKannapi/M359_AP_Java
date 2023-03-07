package Unit9.Lab;

public class Hockey extends Athlete{
    private int goals;
    private int assists;
    private int penalties;
    public Hockey(String name, int totalPoints, int timePlayed, String sportPlayed,
                  int goals, int assists, int penalties) {
        super(name, totalPoints, timePlayed, sportPlayed);
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
    public String toString(){
        return "This player has " + goals + ", " + assists + ".";
    }
}
