package Unit5.examples.HeroVillainExample;

public class MarvelMovieTester {
    public static void main(String[] args) {
        SuperHero ironMan = new SuperHero("Iron Man", "Rich, Smart, Supersuit",
                100);
        System.out.println(ironMan);

        Villain Thanos = new Villain("Thanos", "Super Snap", 300);

        System.out.println(Thanos);
    }

    // IF you type /** and press enter, IntelliJ will start your JavaDoc comments for you,
    // Do this AFTER you have your method header created

    /**
     * This method will replicate a battle between a hero and villain and each will
     * take on damage accordingly
     * @param hero
     * @param villain
     */
    public static void battle(SuperHero hero, Villain villain){
        // if here is stronger, they have a 75% chance of winning the battle
        // the winner takes on 10% damage and the loser takes on 35%
        if (hero.getHeroPower().getPowerStrength() > villain.getVillainPower().getPowerStrength()){
            double winChance = Math.random();
            if (winChance < .75){ //hero won
                //update hero strength = 0.9 * strength
                hero.updateStrengthAfterBattle(0.9);
                //update villain strength = 0.65 * strength
            }
            else { // villain won
                //update villain strength = 0.9 * strength
                //update hero strength = 0.65 * strength
            }
        }
        else { //the hero has less strength, so they have 25% of winning the battle
            double winChance = Math.random();
            if (winChance < 0.25) { // hero wins
                //update hero strength = 0.9 * strength
                //update villain strength = 0.65 * strength
            }
            else{ //villain wins
                //update villain strength = 0.9 * strength
                //update hero strength = 0.65 * strength
            }
        }

    }

}
