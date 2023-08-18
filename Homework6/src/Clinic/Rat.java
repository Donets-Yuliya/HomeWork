package Clinic;

public class Rat extends Animal{
    public Rat(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Пи!");
    }
}
