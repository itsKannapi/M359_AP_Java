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
}
