package Unit5.Lab;

public class Team {
    private String teamName = "";
    private Skill teamSkill;
    //if false, the team is from the west. true, it is from the east
    private boolean location;

    //constructor
    public Team(String teamName, Skill teamSkill, boolean location) {
        this.teamName = teamName;
        this.teamSkill = teamSkill;
        this.location = location;
    }

    // determines if the team is from the east or west
    public String determineLocation(){
        if(location){
            return "East";
        }
        else{
            return "West";
        }
    }
    // toString program
    public String toString(){
        String str = "The hockey team is called " + teamName + "and they are from the " + determineLocation();
        return str;
    }
    //getters/setters
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Skill getTeamSkill() {
        return teamSkill;
    }

    public void setTeamSkill(Skill teamSkill) {
        this.teamSkill = teamSkill;
    }
}
