// Joey and Colin
package Unit9.Lab;

public class Football extends Athlete {
    private int fieldGoals;
    private int touchdowns;

    public Football(String name, int totalPoints, double timePlayed, int fieldGoals, int touchdowns) {
        super(name, totalPoints, timePlayed, "Football");
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
    public void simulateGame() {
        int percent = super.getPercentage();
        int extraPointPercentage = (int) (Math.random() * 100);
        if (percent >= 75) {
            touchdowns++;
            super.setTotalPoints(6);
            if (extraPointPercentage >= 50)
                super.setTotalPoints(1);
        }
        if (percent < 75 && percent > 10)
            System.out.println(super.getName() + " ran a play");
        if (percent <= 10) {
            fieldGoals++;
            super.setTotalPoints(3);
        }
    }

    public String toString() {
        return super.toString() + "\n" + super.getName()
                + " scored " + touchdowns + " touchdowns and "
                + fieldGoals + " field goals.";
    }
}
