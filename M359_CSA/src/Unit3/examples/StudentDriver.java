package Unit3.examples;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", "Denna", 123456);
        Student s2 = new Student("Shannon", "Denna", 123456);
        Student s3 = new Student("Shannon", "Denna", 123456);

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s2.compareTo(s2));

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
    }
}
