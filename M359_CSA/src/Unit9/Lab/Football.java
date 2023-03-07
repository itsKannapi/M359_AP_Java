package Unit9.Lab;

public class Football extends Athlete{
    private int fieldGoals;
    private int touchdowns;

    public Football(String name, int totalPoints, double timePlayed, int fieldGoals, int touchdowns){
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
}
