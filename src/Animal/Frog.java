package Animal;

import java.util.ArrayList;
import java.util.List;

public class Frog extends Animal implements ISound{
    private String nameAnimal = "Frog";
    private String frogSound = "Frog này kêu Ộp Ộp";

    public Frog(){
        super();
    }
    public Frog(String name, double age, String sex){
        super(name, age, sex);
    }

    @Override
    public String NameAnimal() {
        return nameAnimal;
    }

    @Override
    public String Sound() {
        return frogSound;
    }

    public List<Frog> ShowFrog() {
        List<Frog> frogList = new ArrayList<Frog>();
        frogList.add(new Frog("Red Backed Poison", 0.1, "female"));
        frogList.add(new Frog("Strawberry Poison-Dart", 0.3, "male"));
        frogList.add(new Frog("Splash Backed Poison", 1.2, "male"));
        frogList.add(new Frog("Phantasmal Poison", 2.9, "female"));

        return frogList;
    }

    public static double AverageAge() {
        Frog frog = new Frog();

        int size = frog.ShowFrog().size();
        double totalAge = 0;
        for (Frog d : frog.ShowFrog()) {
            totalAge += d.getAge();
        }

        double averageAge = totalAge / size;

        return averageAge;
    }

    public double ShowAverAge() {
        return AverageAge() > 0 ? AverageAge() : 0;
    }
}
