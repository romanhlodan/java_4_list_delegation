package com.company;

import java.util.Objects;

public class Engine {
    private String modelE;
    private double volume;
    private int hp;

    public Engine() {
    }

    public Engine(String model, double volume, int hp) {
        this.modelE = model;
        this.volume = volume;
        this.hp = hp;
    }

    public String getModel() {
        return modelE;
    }

    public void setModel(String model) {
        this.modelE = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return volume == engine.volume &&
                hp == engine.hp &&
                modelE.equals(engine.modelE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelE, volume, hp);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + modelE + '\'' +
                ", volume=" + volume +
                ", hp=" + hp +
                '}';
    }
}
