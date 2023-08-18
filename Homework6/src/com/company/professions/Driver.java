package com.company.professions;

public class Driver {
    private String fio;
    private int experience;

    public Driver(String fio, int experience) {
        this.fio = fio;
        this.setExperience(experience);
    }

    @Override
    public String toString() {
        return String.format("Водитель %s со стажем %s лет", fio, experience);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            System.out.println("Неверный стаж");
        } else {
            this.experience = experience;
        }
    }
}
