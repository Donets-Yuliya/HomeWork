package Instrument;

public class Drum implements Instrument {
    private int diameter;
    private int height;

    public Drum(int diameter, int height) {
        this.setDiameter(diameter);
        this.setHeight(height);
    }

    @Override
    public void play() {
        System.out.println(String.format("Играет барабан размером %d x %d", diameter, height));
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        if (diameter < 0) {
            System.out.println("Неверный диаметр");
        } else {
            this.diameter = diameter;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0) {
            System.out.println("Неверная высота");
        } else {
            this.height = height;
        }
    }
}
