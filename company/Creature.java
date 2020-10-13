package com.company;

public abstract class Creature {
    private String name;
    private int initialWater;
    protected int maxWater;
    protected Boolean living;
    protected int distance;
    protected int waterLevel;

    public Creature(String name, int initialWater){
        this.name = name;
        this.initialWater = initialWater;
    }
    public boolean isAlive(){
        living = waterLevel > 0;
        return living;
    }
    public String getName() {
        return name;
    }
    public int getDistance() {
        return distance;
    }
    public void checkWaterLimit(){
        if(waterLevel > maxWater)waterLevel = maxWater;
    }
    public String toString(){
        return name + " is alive: " + isAlive() +"\nDistance covered: "+distance+"\nWater level: "+waterLevel+"\n";
    }

    public abstract void sunny();
    public abstract void cloudy();
    public abstract void rainy();

}