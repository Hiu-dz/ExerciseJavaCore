package Animal;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal implements ISound {
    private String nameAnimal = "Dog";
    private String dogSound = "Dog này kêu Gâu Gâuu";

    public Dog() {
        super();
    }

    public Dog(String name, double age, String sex) {
        super(name, age, sex);
    }

    @Override
    public String Sound() {
        return dogSound;
    }

    @Override
    public String NameAnimal() {
        return nameAnimal;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public List<Dog> ShowDog() {
        List<Dog> dogList = new ArrayList<Dog>();
        dogList.add(new Dog("Yorkshire", 3, "female"));
        dogList.add(new Dog("Bully", 2.5, "male"));
        dogList.add(new Dog("Dachshund", 3.1, "male"));
        dogList.add(new Dog("Poodle", 1.9, "female"));

        return dogList;
    }

    public static double AverageAge() {
        Dog dog = new Dog();

        int size = dog.ShowDog().size();
        double totalAge = 0;
        for (Dog d : dog.ShowDog()) {
            totalAge += d.getAge();
        }

        double averageAge = totalAge / size;

        return averageAge;
    }

    public double ShowAverAge() {
        return AverageAge() > 0 ? AverageAge() : 0;
    }
}
