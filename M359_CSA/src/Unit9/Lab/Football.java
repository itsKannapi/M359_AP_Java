// Joey and Colin
package Unit9.Lab;

public class Football extends Athlete{
    private int fieldGoals;
    private int touchdowns;

    /**
     * A constructor for the Football subclass.
     * @param name the name of the Football player which is sent to the superclass Athlete.
     * @param totalPoints the total points of the Football player which is sent to the superclass Athlete.
     * @param timePlayed the total time played for the Football player which is sent to the superclass Athlete.
     * @param fieldGoals the amount of fieldGoals the player made which is set to the int fieldGoals.
     * @param touchdowns the amount of touchdowns the player made which is set to the int touchdowns.
     */
    public Football(String name, int totalPoints, int timePlayed, int fieldGoals, int touchdowns){
        super(name,totalPoints,timePlayed,"Football");
        this.fieldGoals = fieldGoals;
        this.touchdowns = touchdowns;
    }

    public int getFieldGoals() {
        return fieldGoals;
    }

    public void setFieldGoals(int fieldGoals) {
        this.fieldGoals = fieldGoals;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    // simulate game method
    // where the if the percentage in the athlete class higher than a percentage
    // it would then add one to any of the variables if applies to
    // example: if % returned in athlete > 80 (80% for goals): add one to goals (applies to all stats)
    /**
     * A method that simulates a game for the football player.
     * The method uses the super simulateGame method to obtain the random percentage 1-100.
     * The method also creates a random percentage variable from 1-100 to decide if the
     * player makes an extra point or not.
     * The method then goes through if statements to decide how many points and
     * how much time should be added to the players totalPoints and totalTimePlayed.
     * The method also adds to the proper variables of how many touchdowns and how many
     * fieldGoals are made.
     * This method overrides the superclass method simulateGame().
     */
    public void simulateGame(){
        super.simulateGame();
        int percent = super.getPercentage();
        int extraPointPercentage = (int) (Math.random() * 100);
        if (percent >= 75) {
            touchdowns++;
            super.setTotalPoints(6);
            super.setTimePlayed(10);
            if (extraPointPercentage >= 50) {
                super.setTotalPoints(1);
                super.setTimePlayed(5);
            }
        }
        if (percent < 75 && percent > 10)
            super.setTimePlayed(15);
        if (percent <= 10) {
            fieldGoals++;
            super.setTotalPoints(3);
            super.setTimePlayed(5);
        }
    }
    /**
     * A basic custom toString that prints the data of the subclass Football.
     * @return - returns a String
     */
    public String toString(){
        return super.toString() + "\n" + super.getName()
                + " scored " + touchdowns + " touchdowns and "
                + fieldGoals + " field goals.";
    }
}

