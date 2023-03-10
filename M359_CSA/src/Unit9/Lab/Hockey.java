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
    //simulate game method
    // method where the if the percentage in the athlete class higher than a percentage
    // it would then add one to any of the variables if applies to
    // example: if % returned in athlete > 80 (80% for goals): add one to goals (applies to all stats)
    public String toString(){
        return super.toString() + "\n" + getName() + " has " +  goals + " goals and " + assists + " assists with "
                + penalties + " penalties";
    }
}
