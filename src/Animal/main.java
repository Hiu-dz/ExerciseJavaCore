package Animal;

public class main {
    public static void main(String[] args) {
        Kittens k = new Kittens("aaa", 1);
        System.out.println(k);
        System.out.println(k.Sound());

        System.out.println("---- Dog ----");
        Dog d = new Dog();
        for (Dog dog : d.ShowDog()) {
            System.out.println(dog);
        }
        System.out.println(d.ShowAverAge());

        System.out.println("---- Frog ----");
        Frog f = new Frog();
        for (Frog frog : f.ShowFrog()) {
            System.out.println(frog);
        }
        System.out.println(f.ShowAverAge());

        System.out.println("---- Cat ----");
        Cat c = new Cat();
        for (Cat cat : c.ShowCat()) {
            System.out.println(cat);
        }
        System.out.println(c.ShowAverAge());

        System.out.println("---- Kittens ----");
        Kittens kk = new Kittens();
        for (Kittens kittens : kk.ShowKittens()) {
            System.out.println(kittens);
        }
        System.out.println(kk.ShowAverAge());

        System.out.println("---- Tomcats ----");
        Tomcats t = new Tomcats();
        for (Tomcats tomcats : t.ShowTomcats()) {
            System.out.println(tomcats);
        }
        System.out.println(t.ShowAverAge());
    }
}
