package day9.Task1;

import day9.Task1.Human;

public class Teacher extends Human {
    private String subjectName;

    public Teacher(String name,String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }
    public void printInfo() {
        System.out.println(
                "Этот человек с именем " + super.getName()
                        +"\nЭтот преподаватель с именем " + getName()
        );
    }
}
