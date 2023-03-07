package Unit9.Lab;

public class Sport {
    private String name;
    private String typeBall;
    private int lengthOfGame;

    public Sport(String name, String typeBall, int lengthOfGame){
        this.name = name;
        this.typeBall = typeBall;
        this.lengthOfGame = lengthOfGame;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getTypeBall(){
        return typeBall;
    }

    public void setTypeBall(String t){
        typeBall = t;
    }
    public int getLengthOfGame(){
        return lengthOfGame;
    }
    public void setLengthOfGame(int g){
        lengthOfGame = g;
    }
    public String toString(){
        String str = "";
        return str;
    }
}
