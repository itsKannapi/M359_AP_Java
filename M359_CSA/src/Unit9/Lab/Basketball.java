// Joey and Colin
package Unit9.Lab;

public class Basketball extends Athlete{
    private int freeThrows;
    private int threePointers;
    private int layUps;
    private int dunks;

    /**
     * A constructor for the Basketball subclass.
     * @param name the name of the Basketball player which is sent to the superclass Athlete.
     * @param totalPoints the total points of the Basketball player which is sent to the superclass Athlete.
     * @param timePlayed the total time played for the Basketball player which is sent to the superclass Athlete.
     * @param freeThrows the amount of free throws the Basketball player made which is set to the int freeThrows.
     * @param threePointers the amount of three pointers the Basketball player made which is set to the int threePointers.
     * @param layUps the amount of lay ups the Basketball player made which is set to the int layUps.
     * @param dunks the amount of dunks the Basketball player made which is set to the int dunks.
     */
    public Basketball(String name, int totalPoints, int timePlayed, int freeThrows, int threePointers, int layUps, int dunks){
        super(name,totalPoints,timePlayed,"Basketball");
        this.freeThrows = freeThrows;
        this.threePointers = threePointers;
        this.layUps = layUps;
        this.dunks = dunks;
    }

    public int getFreeThrows() {
        return freeThrows;
    }

    public void setFreeThrows(int freeThrows) {
        this.freeThrows = freeThrows;
    }

    public int getThreePointers() {
        return threePointers;
    }

    public void setThreePointers(int threePointers) {
        this.threePointers = threePointers;
    }

    public int getLayUps() {
        return layUps;
    }

    public void setLayUps(int layUps) {
        this.layUps = layUps;
    }

    public int getDunks() {
        return dunks;
    }

    public void setDunks(int dunks) {
        this.dunks = dunks;
    }

    // simulate game method
    // where the if the percentage in the athlete class higher than a percentage
    // it would then add one to any of the variables if applies to
    // example: if % returned in athlete > 80 (80% for goals): add one to goals (applies to all stats)

    /**
     * A method that simulates a game for the basketball player.
     * The method uses the super simulateGame method to obtain the random percentage 1-100.
     * The method then goes through if statements to decide how many points and
     * how much time should be added to the players totalPoints and totalTimePlayed.
     * The method also adds to the proper variables of how many threePointers,
     * layUps, dunks, and freeThrows are made.
     * This method overrides the superclass method simulateGame().
     */
    @Override
    public void simulateGame(){
        super.simulateGame();
        int percent = super.getPercentage();
        if (percent >= 70) {
            threePointers++;
            super.setTotalPoints(3);
            setTimePlayed(5);
        }
        if (percent < 70 && percent >= 40) {
            layUps++;
            super.setTotalPoints(2);
            setTimePlayed(5);
        }
        if (percent < 40 && percent >= 30){
            dunks++;
            super.setTotalPoints(2);
            setTimePlayed(5);
        }
        if(percent < 30 && percent >= 20) {
            freeThrows++;
            super.setTotalPoints(1);
            setTimePlayed(5);
        }
        else {
            setTimePlayed(10);
        }
    }
    /**
     * A basic custom toString that prints the data of the subclass Basketball.
     * @return - returns a String
     */
    public String toString(){
        return super.toString() +
                "\n" + super.getName() + " scored " + freeThrows + " free throws, "
                + threePointers + " three pointers, "
                + layUps + " layups, and "
                + dunks + " dunks.";
    }
}