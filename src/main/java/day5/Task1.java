package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("");
        car.setColor("Green");
        car.setYearOfRelease(2020);
        System.out.println(
                "Car brand: " + car.getModel() + "\nThe color of the machine: "
                + car.getColor() + "\nYear of manufacture of the car: " + car.getYearOfRelease()
        );
    }
}
