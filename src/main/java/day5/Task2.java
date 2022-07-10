package day5;


public class Task2 {
    public static void main(String[] args) {
    Motorbike motorbike = new Motorbike("Kawasaki","Blue",2021);
        System.out.println(
                "Model motorbike: " + motorbike.getModel()
                + "\nThe color of the motorbike: " + motorbike.getColor()
        + "\nYear of manufacture of the motorbike: " + motorbike.getYearOfRelease()
        );
    }
}
