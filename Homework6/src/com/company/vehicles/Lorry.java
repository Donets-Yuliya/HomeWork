package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{

    private int loadCapacity;

    public Lorry(String carBrand, char carClass, int weight, int loadCapacity, String driverFio, int driverExperience, int enginePower, String engineManufacturer) {
        super(carBrand, carClass, weight, driverFio, driverExperience, enginePower, engineManufacturer);
        this.setLoadCapacity(loadCapacity);
    }

    public Lorry(String carBrand, char carClass, int weight, int loadCapacity, Driver driver, Engine motor) {
        super(carBrand, carClass, weight, driver, motor);
        this.setLoadCapacity(loadCapacity);
    }

    @Override
    public String toString() {
        String str = "Автомобиль марки " + this.getCarBrand() + " класса " + this.getCarClass() + ", вес " + this.getWeight() +
                     ", грузоподъемность " + loadCapacity + ". " +
                     this.getDriver().toString() + ". " + this.getMotor().toString();
        System.out.println(str);
        return str;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        if (loadCapacity <= 0) {
            System.out.println("Неверная грузоподъемность");
        } else {
            this.loadCapacity = loadCapacity;
        }
    }
}
