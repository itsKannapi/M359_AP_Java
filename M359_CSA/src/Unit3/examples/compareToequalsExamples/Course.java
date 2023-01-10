package Unit3.examples.compareToequalsExamples;

public class Course {
    private String classTitle;

    private int numStudentsEnrolled;

    private String teacherName;

    public Course(String classTitle, int numStudentsEnrolled, String teacherName) {
        this.classTitle = classTitle;
        this.numStudentsEnrolled = numStudentsEnrolled;
        this.teacherName = teacherName;
    }

    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public int getNumStudentsEnrolled() {
        return numStudentsEnrolled;
    }

    public void setNumStudentsEnrolled(int numStudentsEnrolled) {
        this.numStudentsEnrolled = numStudentsEnrolled;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public boolean equals(Course other){
        if (this.classTitle.equals(other.classTitle) && this.numStudentsEnrolled == other.numStudentsEnrolled){
            return true;
        }
        else {
            return false;
        }
    }
    public int compareTo(Course other){
        int diff = this.classTitle.compareTo(other.classTitle);
        if(diff != 0){
            return diff; // this value tells us how the classTitles compare
        }
        else {  // diff = 0 and titles are the same, need to compare numStudents
            return this.numStudentsEnrolled - other.numStudentsEnrolled;
        }
    }
}
