package Animal;

import java.util.List;

public class Animal {
    protected String name;
    protected double age;
    protected String sex;

    public Animal() {

    }

    public Animal(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, double age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // method NameAnimal() để gán vào toString() -> biết được thông tin được hiển thị là của Animal nào.
    public String NameAnimal(){
        String nameAnimal = "Animal";
        return nameAnimal;
    }

    @Override
    public String toString() {
        return NameAnimal() +"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
