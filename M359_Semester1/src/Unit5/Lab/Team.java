package Unit5.Lab;

public class Team {
    private String teamName = "";
    private Skill teamSkill;
    private String location;

    // constructor for the team class
    public Team(String teamName, String location, int DPower, int OPower) {
        this.teamName = teamName;
        this.teamSkill = new Skill(DPower, OPower);
        this.location = location;
    }
    // toString program

    /**
     * This method takes the name of the hockey team from the class and prints it, then
     * it also prints the location where the team is from
     *
     * @return returns the sentence containing team name and location
     */
    public String toString(){
        String str = "The hockey team is called " + teamName + " and they are from the " + location;
        return str;
    }
    // getter and setters for Team class
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Skill getTeamSkill() {
        return teamSkill;
    }

    public void setTeamSkill(int DPower,int OPower) {
        this.teamSkill = new Skill(DPower, OPower);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
