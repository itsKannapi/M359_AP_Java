package Unit5.Lab;

public class Skill {
    private int defensivePower;
    private int offensivePower;

    // constructor for the skill class
    public Skill(int DPower, int OPower){
        this.defensivePower = DPower;
        this.offensivePower = OPower;
    }

    // getter and setters for Skill class
    public int getDefensivePower(){ return defensivePower;}

    public int getOffensivePower(){ return offensivePower;}

    public void setDefensivePower(int DPower){this.defensivePower = DPower;}

    public void setOffensivePower(int OPower){this.offensivePower = OPower;}

}
