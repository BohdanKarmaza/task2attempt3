package com.company.details;

public class Engine {

    public void engine(String manufacturer, String capacity){
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }
    private String manufacturer;
    public String getManufacturer(){
        return this.manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    private String capacity;
    public String getCapacity(){
        return this.capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
