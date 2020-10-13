package com.company;

public class Sponge extends Creature{
    public Sponge(String name, int initialWater) {
        super(name, initialWater);
        waterLevel = initialWater;
        maxWater = 20;
    }
    @Override
    public void sunny() {
        waterLevel -= 4;
        distance += 0;
        checkWaterLimit();
    }
    @Override
    public void cloudy() {
        waterLevel -= 1;
        distance += 1;
        checkWaterLimit();
    }
    @Override
    public void rainy() {
        waterLevel += 6;
        distance += 3;
        checkWaterLimit();
    }
}