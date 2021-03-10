package com.company;

import java.util.Objects;

public class Car {
    private String model;
    private int year;
    private String number;
    Engine engine;
    Wheel wheel;

    public Car() {
    }

    public Car(String model, int year, String number, String modelE, double volume, int hp, String manufacturer, int diameter ) {
        this.model = model;
        this.year = year;
        this.number = number;
        this.engine = new Engine(modelE,volume,hp);
        this.wheel = new Wheel(manufacturer,diameter);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                model.equals(car.model) &&
                number.equals(car.number) &&
                wheel.equals(car.wheel) &&
                engine.equals(car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, number, wheel, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", number='" + number + '\'' +
                ", engine=" + engine +
                ", wheel=" + wheel +
                '}';
    }
}
