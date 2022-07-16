package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Patrick","automation");
        Teacher teacher = new Teacher("mrs.Pow","mathematics");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
