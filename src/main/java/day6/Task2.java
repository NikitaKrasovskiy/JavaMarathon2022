package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("FlyDubai",2014,215,5);
        airplane.info();
        Airplane airplane2 = new Airplane("FlyRussia",2010,50,6);
        airplane2.setYear(2015);
        airplane2.setLength(36);
        airplane2.fillUp(2000);
        airplane2.fillUp(10000);
        airplane2.info();

    }
}
