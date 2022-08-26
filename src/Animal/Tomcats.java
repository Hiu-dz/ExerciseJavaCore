package Animal;

import java.util.ArrayList;
import java.util.List;

public class Tomcats extends Cat{
    private String nameAnimal = "Dog";
    private String tomcatSound = "Tomcat này kêu Mie Mie";
    public Tomcats() {
    }

    public Tomcats(String name, double age) {
        super(name, age);
        super.sex = "male";
    }

    @Override
    public String NameAnimal() {
        return nameAnimal;
    }

    @Override
    public String Sound() {
        return tomcatSound;
    }

    public List<Tomcats> ShowTomcats() {
        List<Tomcats> tomcatsList = new ArrayList<Tomcats>();
        tomcatsList.add(new Tomcats("Sphynx không lông", 0.2));
        tomcatsList.add(new Tomcats("Mèo rừng Na Uy", 0.3));
        tomcatsList.add(new Tomcats("Mèo Ba Tư Exotic", 0.4));
        tomcatsList.add(new Tomcats("Mèo Ba Tư Himalayan", 0.5));

        return tomcatsList;
    }

    public static double AverageAge() {
        Tomcats tomcats = new Tomcats();

        int size = tomcats.ShowTomcats().size();
        double totalAge = 0;
        for (Tomcats t : tomcats.ShowTomcats()) {
            totalAge += t.getAge();
        }

        double averageAge = totalAge / size;

        return averageAge;
    }

    public double ShowAverAge() {
        return AverageAge() > 0 ? AverageAge() : 0;
    }
}