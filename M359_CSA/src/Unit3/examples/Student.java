package Unit3.examples;

public class Student {
    private String fName;
    private String lName;
    private int idName;

    public Student(String fName, String lName, int idName) {
        this.fName = fName;
        this.lName = lName;
        this.idName = idName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getIdName() {
        return idName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setIdName(int idName) {
        this.idName = idName;
    }

    public boolean equals(Student other){
        if (this.getfName().equals(other.getfName())){
            if (this.getlName().equals(other.getlName()))
                return true;
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }
    public int compareTo(Student other){
        int lNameDiff = this.lName.compareTo(other.lName);

        if(lNameDiff != 0) {
            return lNameDiff;
        }
        return this.fName.compareTo(other.lName);
    }
}
