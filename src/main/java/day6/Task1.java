package day6;


public class Task1 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Kawasaki","blue",2020);
        Car car = new Car();
        car.setModel("BMW");
        car.setColor("Green and Black");
        car.setYearOfRelease(2020);

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2010));
        System.out.println(motorbike.yearDifference(2010));

    }
}
