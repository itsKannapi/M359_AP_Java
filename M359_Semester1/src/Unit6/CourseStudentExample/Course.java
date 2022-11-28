package Unit6.CourseStudentExample;

public class Course {
    private String teacherName, subject, currentGrade;
    private int period;

    public Course(String teacherName, String subject, String currentGrade, int period) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.currentGrade = currentGrade;
        this.period = period;
    }

    public Course(String subject, int period) {
        this.subject = subject;
        this.period = period;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
    public String toString(){
        String str = "";
        str += "Per: " + period + "    ";
        if (currentGrade != null){
            str += currentGrade;
        }
        else{
            str += "--";
        }
        if (teacherName != null){
            str += teacherName;
        }
        return str;
        
    }
}
