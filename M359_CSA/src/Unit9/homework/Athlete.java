package Unit9.homework;

public class Athlete {
    private String name;
    private int age = 0;

    public Athlete(String n, int a){
        this.name = n;
        this.age = a;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

}
