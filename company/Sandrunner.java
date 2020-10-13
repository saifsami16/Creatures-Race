package com.company;

public class Sandrunner extends Creature {
    public Sandrunner(String name, int initialWater) {
        super(name, initialWater);
        waterLevel = initialWater;
        maxWater = 8;
    }
    @Override
    public void sunny() {
        waterLevel -= 1;
        distance += 3;
        checkWaterLimit();
    }
    @Override
    public void cloudy() {
        waterLevel += 0;
        distance += 1;
        checkWaterLimit();
    }
    @Override
    public void rainy() {
        waterLevel += 3;
        distance += 0;
        checkWaterLimit();
    }
}