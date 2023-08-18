package Instrument;

public class Tuba implements Instrument{
    private int diameter;

    public Tuba(int diameter) {
        this.setDiameter(diameter);
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + diameter);
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
}
