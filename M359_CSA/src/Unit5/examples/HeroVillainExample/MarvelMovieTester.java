package Unit5.examples.HeroVillainExample;

import java.util.logging.StreamHandler;

public class MarvelMovieTester {
    public static void main(String[] args) {
        SuperHero ironMan = new SuperHero("Iron Man", "Rich, Smart, Supersuit",
                100);
        System.out.println(ironMan);

        Villain Thanos = new Villain("Thanos", "Super Snap", 200);

        System.out.println(Thanos);

        epicBattle(ironMan, Thanos, 5);
        System.out.println(ironMan);
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
                System.out.println(hero.getHeroName() + " won!");
                //update villain strength = 0.65 * strength
                villain.updateStrengthAfterBattle(0.65);
                System.out.println(villain.getVillainName() + " lost!");
            }
            else { // villain won
                //update villain strength = 0.9 * strength
                villain.updateStrengthAfterBattle(0.9);
                System.out.println(villain.getVillainName() + " won!");
                //update hero strength = 0.65 * strength
                hero.updateStrengthAfterBattle(0.65);
                System.out.println(hero.getHeroName() + " lost!");
            }
        }
        else { //the hero has less strength, so they have 25% of winning the battle
            double winChance = Math.random();
            if (winChance < 0.25) { // hero wins
                //update hero strength = 0.9 * strength
                hero.updateStrengthAfterBattle(0.9);
                System.out.println(hero.getHeroName() + " won!");
                //update villain strength = 0.65 * strength
                villain.updateStrengthAfterBattle(0.65);
                System.out.println(villain.getVillainName() + " lost!");

            }
            else{ //villain wins
                //update villain strength = 0.9 * strength
                villain.updateStrengthAfterBattle(0.9);
                System.out.println(villain.getVillainName() + " won!");
                //update hero strength = 0.65 * strength
                hero.updateStrengthAfterBattle(0.65);
                System.out.println(hero.getHeroName() + " lost!");
            }
        }

    }

    /**
     * This method will call numRounds times to simulate a longrunnning fight between good and evil
     *
     * @param hero the Superhero
     * @param villain the Villain
     * @param numRounds the number of times the battle will run
     */
    public static void epicBattle(SuperHero hero, Villain villain, int numRounds){
        for (int i = 0; i < numRounds; i++){
            if (hero.getHeroPower().getPowerStrength() == 0 || villain.getVillainPower().getPowerStrength() == 0) {
                System.out.println("Game Over!");
                break;
            }
            battle(hero, villain);
            System.out.println(hero);
            System.out.println(villain);
        }
    }

}
