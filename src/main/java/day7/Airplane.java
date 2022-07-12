package day7;

public class Airplane {
    private String manufacturer ;
    private int year ;
    private long length ;
    private int weight ;
    private int fuel;

    public Airplane(String manufacturer, int year, long length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public long getLength() {
        return length;
    }

    public void info() {
        System.out.println(
                "Manufacturer: " + manufacturer + "; year of release: "
                + year + "; Length: " + length + "; Weight: " + weight
                + "; amount of fuel in the tank: " + getFuel()
        );
    }
    void fillUp(int n) {
         fuel += n;
    }

    public static void compareAirplanes(Airplane airplane, Airplane airplane1) {
        if(airplane.getLength() > airplane1.getLength() ) {
            System.out.println(
                    "Самолет: " + airplane + " больше чем " + airplane1
            );

        }else if(airplane.getLength() < airplane1.getLength()){

            System.out.println(
                    "Самолет: " + airplane + " больше чем " + airplane1
            );
        }else{
            System.out.println(
                    "Длины самолетов равны"
            );
        }
    }
    //
}
