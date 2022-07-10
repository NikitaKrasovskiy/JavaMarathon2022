package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Екатерина Мухаматовна","ОБЖ");
        Student student = new Student("Вишнева Леонтия Сергеивича");
        teacher.evaluateStudent(student);
    }
}
