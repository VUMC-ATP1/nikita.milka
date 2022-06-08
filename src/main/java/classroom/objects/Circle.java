package classroom.objects;

public class Circle {

    public final double PI = 3.14;
    public double radius;

    public double calculateArea(double radius) {
        return PI * Math.pow(radius, 2);
    }

    public Circle(double radius) {
        this.radius = calculateArea(radius);
    }

}
