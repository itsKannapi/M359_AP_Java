package Unit5.examples.HeroVillainExample;

public class Power {
    private String nameOfPower = "";
    private int powerStrength;

    public Power(String nameOfPower, int powerStrength) {
        this.nameOfPower = nameOfPower;
        this.powerStrength = powerStrength;
    }
    public String toString() {
        return "The power is: " + nameOfPower + " with a strength of: " + powerStrength;
    }



    public String getNameOfPower() {
        return nameOfPower;
    }

    public void setNameOfPower(String nameOfPower) {
        this.nameOfPower = nameOfPower;
    }

    public int getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(int powerStrength) {
        this.powerStrength = powerStrength;
    }
}
