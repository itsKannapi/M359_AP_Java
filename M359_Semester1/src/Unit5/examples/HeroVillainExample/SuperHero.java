package Unit5.examples.HeroVillainExample;

public class SuperHero {
    private String heroName = "";
    private Power heroPower;

    public SuperHero(String heroName, Power heroPower) {
        this.heroName = heroName;
        this.heroPower = heroPower; // this copies the reference to an already created
        // power object
    }
    public SuperHero(String heroName, String powerName, int powerStrength) {
        this.heroName = heroName;
        this.heroPower = new Power(powerName, powerStrength);
        //here we create a new Power object with the passed name and strength
    }
    public void updateStrengthAfterBattle(double percent){
        heroPower.setPowerStrength((int)percent * heroPower.getPowerStrength());
    }
    public String toString() {
        String str = "This Super Hero is named: " + heroName + "\n";
        if (heroPower != null) {
            str += heroPower.toString();
            //String from the Power class to thing string we continue
            //building up from here inside SuperHero class
        }
        return str;
    }





    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Power getHeroPower() {
        return heroPower;
    }

    public void setHeroPower(Power heroPower) {
        this.heroPower = heroPower;
    }
}
