package Animal;

import java.util.ArrayList;
import java.util.List;

public class Kittens extends Cat{
    private String nameAnimal = "Kitten";
    private String kittenSound = "Kitten này kêu Mia Miaa";

    public Kittens(){
    }
    public Kittens(String name, double age) {
        super(name, age);
        super.sex = "female";
    }

    @Override
    public String Sound() {
        return kittenSound;
    }

    @Override
    public String NameAnimal() {
        return nameAnimal;
    }

    public List<Kittens> ShowKittens() {
        List<Kittens> kittensList = new ArrayList<Kittens>();
        kittensList.add(new Kittens("Sphynx không lông", 0.5));
        kittensList.add(new Kittens("Mèo rừng Na Uy", 0.8));
        kittensList.add(new Kittens("Mèo Ba Tư Exotic", 0.7));
        kittensList.add(new Kittens("Mèo Ba Tư Himalayan", 0.2));

        return kittensList;
    }

    public static double AverageAge() {
        Kittens kittens = new Kittens();

        int size = kittens.ShowKittens().size();
        double totalAge = 0;
        for (Kittens k : kittens.ShowKittens()) {
            totalAge += k.getAge();
        }

        double averageAge = totalAge / size;

        return averageAge;
    }

    public double ShowAverAge() {
        return AverageAge() > 0 ? AverageAge() : 0;
    }
}
