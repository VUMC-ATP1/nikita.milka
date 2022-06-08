package classroom.objects;

public class Dog extends Animal {

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String breed;

    @Override
    public void voice() {
        System.out.println("Wooof-wooof!");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
