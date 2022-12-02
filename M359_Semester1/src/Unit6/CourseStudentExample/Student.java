package Unit6.CourseStudentExample;

public class Student {
    private String name;
    public Course[] myClasses;

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }

    public Student(String name) {
        this.name = name;
        this.myClasses = new Course[8];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getMyClasses() {
        return myClasses;
    }

    public void setMyClasses(Course[] myClasses) {
        this.myClasses = myClasses;
    }
    public String toString(){
        String str = "Student Name: " + name;

        for (int i = 0; i < 8; i++){
            str += "\n" + myClasses[i];
        }
        return str;
    }
}

