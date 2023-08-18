package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carBrand;
    private char carClass;
    private int weight;
    private Driver driver;
    private Engine motor;

    public Car(String carBrand, char carClass, int weight, String driverFio, int driverExperience, int enginePower, String engineManufacturer) {
        this.carBrand = carBrand;
        this.setCarClass(carClass);
        this.setWeight(weight);
        this.setDriver(driverFio, driverExperience);
        this.setMotor(enginePower, engineManufacturer);
    }

    public Car(String carBrand, char carClass, int weight, Driver driver, Engine motor) {
        this.carBrand = carBrand;
        this.setCarClass(carClass);
        this.setWeight(weight);
        this.driver = driver;
        this.motor = motor;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        String str = "Автомобиль марки " + carBrand + " класса " + carClass + ", вес " + weight + ". " +
                     driver.toString() + ". " + motor.toString();
        System.out.println(str);
        return str;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public char getCarClass() {
        return carClass;
    }

    public void setCarClass(char carClass) {
        switch (carClass) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'S':
            case 'M':
            case 'J': {
                this.carClass = carClass;
                break;
            }
            default: {
                System.out.println("Неверный класс автомобиля");
            }
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <=0) {
            System.out.println("Неверный вес автомобиля");
        } else {
            this.weight = weight;
        }
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setDriver(String fio, int experience) {
        this.driver = new Driver(fio, experience);
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    public void setMotor(int power, String manufacturer) {
        this.motor = new Engine(power, manufacturer);
    }
}
