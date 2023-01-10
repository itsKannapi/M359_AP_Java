package Unit5.examples.HeroVillainExample;

public class Villain {
    private String villainName = "";
    private Power villainPower;
    // this static value needs to be initialized to 0 so that we can update
    // it each time we crete a new heroes
    private static int numVillains = 0;
    public static int totalVillainStrength = 0;
    public Villain(String villainName, Power villainPower) {
        this.villainName = villainName;
        this.villainPower = villainPower; // this copies the reference to an already created
        // power object
        numVillains++;
        totalVillainStrength += villainPower.getPowerStrength();
    }
    public Villain(String villainName, String powerName, int powerStrength) {
        this.villainName = villainName;
        this.villainPower = new Power(powerName, powerStrength);
        //here we create a new Power object with the passed name and strength
        numVillains++;
        totalVillainStrength += villainPower.getPowerStrength();
    }
    public void updateStrengthAfterBattle(double percent){
        // need to figure out how much to subtract from totalVillainStrength BEFORE
        //we call setStrength
        int x = (int)((1 - percent)* villainPower.getPowerStrength());
        totalVillainStrength -= x;
        villainPower.setPowerStrength((int)(percent * villainPower.getPowerStrength()));
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

    public static int getNumVillains(){
        return numVillains;
    }
    public static int getTotalVillainStrength(){
        return totalVillainStrength;
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
