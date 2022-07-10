package day6;

import java.util.Random;

public class Teacher {
    private final String[] ESTIMATION_ARRAYS = new String[] {
            "отлично", "хорошо", "удовлетворительно", "неудовлетворительно"
    };
    private String nameTeacher;
    private String object;

    public Teacher(String nameTeacher, String object) {
        this.nameTeacher = nameTeacher;
        this.object = object;
    }
    public void  evaluateStudent(Student student) {
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 2;

        String evaluateStudent = null;

        for (String evaluate:ESTIMATION_ARRAYS) {
            if(randomNumber == 2) {
                evaluate = ESTIMATION_ARRAYS[3];
            }else if(randomNumber == 3) {
                evaluate = ESTIMATION_ARRAYS[2];
            }else if(randomNumber == 4) {
                evaluate = ESTIMATION_ARRAYS[1];
            }else{
                evaluate = ESTIMATION_ARRAYS[0];
            }
            evaluateStudent = evaluate;
        }
        System.out.println(
                "Преподователь " + nameTeacher +",оценил студента " + student.getNameStudent()
        + " по предмету " + object + " на оценку: " + evaluateStudent
        );
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }


}
