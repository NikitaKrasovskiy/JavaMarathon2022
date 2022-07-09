package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("FlyDubai", 2015, 36, 6);
        Airplane airplane2 = new Airplane("FlyDubai", 2013, 15, 7);

        Airplane.compareAirplanes(airplane,airplane2);

    }
}