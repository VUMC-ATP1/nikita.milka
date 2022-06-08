package classroom.objects;

public class Practice {
    public static void main(String[] args) {

        Car bmw = new Car();
        System.out.println(bmw.brand);
        bmw.color = "red";
        bmw.name = "i3";
        bmw.doorCount = 4;
        bmw.brand = "BMW";

        Car audi = new Car("A7", "BLACK", 2, "AUDI");

        System.out.println();

        Circle circle = new Circle(12);
        System.out.println(circle.radius);

        Animal animal = new Animal("Animal", 1);
        animal.voice();

        Dog papsis = new Dog("Papitos", 1, "Jack Russel");
        papsis.voice();

        System.out.println(papsis);
    }
}
