package com.company;

import java.util.Objects;

public class Wheel {
    private String manufacturer;
    private int diameter;

    public Wheel() {
    }

    public Wheel(String manufacturer, int diameter) {
        this.manufacturer = manufacturer;
        this.diameter = diameter;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return diameter == wheel.diameter &&
                manufacturer.equals(wheel.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, diameter);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "manufacturer='" + manufacturer + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
