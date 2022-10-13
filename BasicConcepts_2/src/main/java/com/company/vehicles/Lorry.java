package com.company.vehicles;

public class Lorry extends Car{
    public Lorry(String carBrand, String carClass, String loadCapacity) {
        super(carBrand, carClass);
        this.loadCapacity = loadCapacity;
    }

    private String loadCapacity;

    public String getLoadCapacity(){
        return this.loadCapacity;
    }
    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void turnLeft(){
        System.out.println("Slowing down");
        System.out.println("Turning left!");
    }

    @Override
    public void turnRight() {
        System.out.println("Slowing down");
        System.out.println("Turning right!");
    }

    @Override
    public void start() {
        System.out.println("Starting on Lorry");
    }
    @Override
    public void stop() {
        System.out.println("Stopping on Lorry");
    }
}
