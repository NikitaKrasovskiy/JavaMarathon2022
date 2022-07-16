package day9.Task1;

import day9.Task1.Human;

public class Student extends Human {
    private String groupName;

    public Student(String  name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    public void printInfo() {
        System.out.println(
                "Этот человек с именем " + super.getName()
                        +"\nЭтот студент с именем " + getName()
        );
    }
}
