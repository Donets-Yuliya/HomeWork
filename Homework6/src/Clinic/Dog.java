package Clinic;

public class Dog extends Animal{
    public Dog(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав!");
    }
}
