package Unit5.examples.HeroVillainExample;

public class SuperHero {
    private String heroName = "";
    private Power heroPower;

    public SuperHero(String heroName, Power heroPower) {
        this.heroName = heroName;
        this.heroPower = heroPower;
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
