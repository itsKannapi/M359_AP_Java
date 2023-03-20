// Joey and Colin
package Unit9.Lab;

public class Basketball extends Athlete{
    private int freeThrows;
    private int threePointers;
    private int layUps;
    private int dunks;

    public Basketball(String name, int totalPoints, int timePlayed, int freeThrows,
                      int threePointers, int layUps, int dunks){
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
     * A basic custom toString that prints the data of the subclass Basketball
     * @return - returns a string
     */
    public String toString(){
        return super.toString() +
                "\n" + super.getName() + " scored " + freeThrows + " free throws, "
                + threePointers + " three pointers, "
                + layUps + " layups, and "
                + dunks + " dunks";
    }
}
