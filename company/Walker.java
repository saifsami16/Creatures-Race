package com.company;

public class Walker extends Creature{
    public Walker(String name, int initialWater) {
        super(name, initialWater);
        waterLevel = initialWater;
        maxWater = 12;
    }
    @Override
    public void sunny() {
        waterLevel -= 2;
        distance += 1;
        checkWaterLimit();
    }
    @Override
    public void cloudy() {
        waterLevel -= 1;
        distance += 2;
        checkWaterLimit();
    }
    @Override
    public void rainy() {
        waterLevel += 3;
        distance += 1;
        checkWaterLimit();
    }
}