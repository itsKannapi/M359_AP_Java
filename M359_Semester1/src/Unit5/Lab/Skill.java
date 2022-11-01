package Unit5.Lab;

public class Skill {
    private int defensivePower;
    private int offensivePower;

    //Combine defensivePower and offensivePower,
    // if combined number is > or < ___ number then overallStrength is = to ___ number.

    //Constructor
    public Skill(int DPower, int OPower){
        this.defensivePower = DPower;
        this.offensivePower = OPower;
    }

    public int getDefensivePower(){ return defensivePower;}

    public int getOffensivePower(){ return offensivePower;}

    public void setDefensivePower(int DPower){this.defensivePower = DPower;}

    public void setOffensivePower(int OPower){this.offensivePower = OPower;}



}
