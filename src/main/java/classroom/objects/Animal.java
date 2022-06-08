package classroom.objects;

public class Animal {

    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println("You call me from Animal class");
    }
}
