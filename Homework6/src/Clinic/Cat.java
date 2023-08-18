package Clinic;

public class Cat extends Animal{
    public Cat(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу!");
    }
}
