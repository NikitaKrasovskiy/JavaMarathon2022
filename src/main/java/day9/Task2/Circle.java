package day9.Task2;

public class Circle extends  Figure{
    private  double circleRadius;

    public Circle(double circleRadius,String color) {
        super(color);
        this.circleRadius = circleRadius;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    @Override
    public double area() {
        return Math.pow(circleRadius,2) * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * circleRadius;
    }
}