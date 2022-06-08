package classroom.objects;

public class Car {
    public String name;
    public String color;
    public int doorCount;
    public String brand;

    // All argument constructor
    public Car(String name, String color, int doorCount, String brand) {
        this.name = name;
        this.color = color;
        this.doorCount = doorCount;
        this.brand = brand;
    }

    public Car() {
    }

    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }
}
