package Unit9.Lab;

public class Basketball extends Athlete{
    private int freeThrows;
    private int threePointers;
    private int layUps;
    private int dunks;

    public Basketball(String name, int totalPoints, double timePlayed, int freeThrows, int threePointers, int layUps, int dunks){
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

    //simulate game method
    // method where the if the percentage in the athlete class higher than a percentage
    // it would then add one to any of the variables if applies to
    // example: if % returned in athlete > 80 (80% for goals): add one to goals (applies to all stats)
    public String toString(){
        return super.toString() + "\n" + getName() + " scored " + freeThrows + " free throws," +
                threePointers + "three pointers, " + layUps + "layups, and " +
                dunks + "dunks.";
    }
}
