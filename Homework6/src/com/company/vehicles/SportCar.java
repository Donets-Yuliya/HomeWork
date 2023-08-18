package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{

    private int maxSpeed;

    public SportCar(String carBrand, char carClass, int weight, int maxSpeed, String driverFio, int driverExperience, int enginePower, String engineManufacturer) {
        super(carBrand, carClass, weight, driverFio, driverExperience, enginePower, engineManufacturer);
        this.setMaxSpeed(maxSpeed);
    }

    public SportCar(String carBrand, char carClass, int weight, int maxSpeed, Driver driver, Engine motor) {
        super(carBrand, carClass, weight, driver, motor);
        this.setMaxSpeed(maxSpeed);
    }

    @Override
    public String toString() {
        String str = "Автомобиль марки " + this.getCarBrand() + " класса " + this.getCarClass() + ", вес " + this.getWeight() +
                ", предельная скорость " + maxSpeed + ". " +
                this.getDriver().toString() + ". " + this.getMotor().toString();
        System.out.println(str);
        return str;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            System.out.println("Неверная максимальная скорость");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}
