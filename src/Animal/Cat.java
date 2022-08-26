package Animal;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal implements ISound{
    private String nameAnimal = "Cat";
    private String catSound = "Cat này kêu Meo Meoo";
    public Cat(){

    }
    public Cat(String name, double age){
        super(name, age);
    }
    public Cat(String name, double age, String sex){
        super(name, age, sex);
    }

    @Override
    public String NameAnimal() {
        return nameAnimal;
    }

    @Override
    public String Sound() {
        return catSound;
    }

    public List<Cat> ShowCat() {
        List<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("British Longhair", 1.5, "female"));
        catList.add(new Cat("Munchkin", 0.8, "male"));
        catList.add(new Cat("Ragdoll", 1.7, "male"));
        catList.add(new Cat("Scottish Fold", 3.2, "female"));

        return catList;
    }

    public static double AverageAge() {
        Cat cat = new Cat();

        int size = cat.ShowCat().size();
        double totalAge = 0;
        for (Cat d : cat.ShowCat()) {
            totalAge += d.getAge();
        }

        double averageAge = totalAge / size;

        return averageAge;
    }

    public double ShowAverAge() {
        return AverageAge() > 0 ? AverageAge() : 0;
    }
}
