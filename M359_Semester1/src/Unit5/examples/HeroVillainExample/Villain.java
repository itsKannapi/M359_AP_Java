package Unit5.examples.HeroVillainExample;

public class Villain {
    private String villainName = "";
    private Power villainPower;

    public Villain(String villainName, Power villainPower) {
        this.villainName = villainName;
        this.villainPower = villainPower;
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
