package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public abstract class Car {

    public Car(String carBrand, String carClass) {
        this.carBrand = carBrand;
        this.carClass = carClass;
    }

    private String carBrand;
    public String getCarBrand(){
        return this.carBrand;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    private String carClass;
    public String getCarClass(){
        return this.carClass;
    }
    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }
    private Driver driver;
    private Engine engine;
    public void start(){
        System.out.println("Let's go!");
    }
    public void stop(){
        System.out.println("Stopping!");
    }
    public void turnRight(){
        System.out.println("Turning right!");
    }
    public void turnLeft(){
        System.out.println("Turning left!");
    }

    @Override
    public String toString(){
        return "Car {carBrand = " + getCarBrand() + ";" +
                "carClass = " + getCarClass() + ";" +
                "driver.fullName = " + driver.getFullName() + ";" +
                "driver.age = " + driver.getAge() + ";" +
                "driver.sex = " + driver.getSex() + ";" +
                "driver.telephoneNumber = " + driver.getTelephoneNumber() + ";" +
                "driver.drivingExperience = " + driver.getDrivingExperience() + ";" +
                "engine.manufacturer = " + engine.getManufacturer() + ";" +
                "engine.capacity = " + engine.getCapacity() + ";";

    }


}
