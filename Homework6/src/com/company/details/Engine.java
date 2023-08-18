package com.company.details;

public class Engine {
    private int power;
    private String manufacturer;

    public Engine(int power, String manufacturer) {
        this.setPower(power);
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return String.format("Мотор мощностью %s, производитель %s", power, manufacturer);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power <= 0) {
            System.out.println("Неверная мощность");
        } else {
            this.power = power;
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
