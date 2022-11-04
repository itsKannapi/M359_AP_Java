package Unit5.examples.HeroVillainExample;

public class SuperHero {
    private String heroName = "";
    private Power heroPower;
    // this static value needs to be initialized to 0 so that we can update
    // it each time we crete a new heroes
    private static int numHeroes = 0;
    public static int totalHeroStrength = 0;
    public SuperHero(String heroName, Power heroPower) {
        this.heroName = heroName;
        this.heroPower = heroPower; // this copies the reference to an already created
                                    // power object
        numHeroes++;
        totalHeroStrength += heroPower.getPowerStrength();
    }
    public SuperHero(String heroName, String powerName, int powerStrength) {
        this.heroName = heroName;
        this.heroPower = new Power(powerName, powerStrength);
        //here we create a new Power object with the passed name and strength
        numHeroes++;
        totalHeroStrength += heroPower.getPowerStrength();
    }
    public void updateStrengthAfterBattle(double percent){
        // need to figure out how much to subtract from totalHeroStrength BEFORE
        //we call setStrength
        int x = (int)((1 - percent)* heroPower.getPowerStrength());
        totalHeroStrength -= x;

        heroPower.setPowerStrength((int)(percent * heroPower.getPowerStrength()));
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


    // because this method is static, it will be called by className.methodName()
    //
    public static int getNumHeroes(){
        return numHeroes;
    }
    public static int getTotalHeroStrength(){
        return totalHeroStrength;
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
