package Unit5.examples.HeroVillainExample;

public class Villain {
    private String villainName = "";
    private Power villainPower;

    public Villain(String villainName, Power villainPower) {
        this.villainName = villainName;
        this.villainPower = villainPower; // this copies the reference to an already created
        // power object
    }
    public Villain(String villainName, String powerName, int powerStrength) {
        this.villainName = villainName;
        this.villainPower = new Power(powerName, powerStrength);
        //here we create a new Power object with the passed name and strength
    }
    public String toString() {
        String str = "This Super Hero is named: " + villainName + "\n";
        if (villainPower != null) {
            str += villainPower.toString();
            //String from the Power class to thing string we continue
            //building up from here inside SuperHero class
        }
        return str;
    }

    public String getVillainName() {
        return villainName;
    }

    public void setVillainName(String villainName) {
        this.villainName = villainName;
    }

    public Power getVillainPower() {
        return villainPower;
    }

    public void setVillainPower(Power villainPower) {
        this.villainPower = villainPower;
    }
}
