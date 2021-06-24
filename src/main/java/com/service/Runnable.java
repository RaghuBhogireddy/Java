package main.java.com.service;

public class Runnable {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setModel("VolVo");
        System.out.println(bmw.getModel());
    }
}

class Car{
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.equalsIgnoreCase("BMW") ||model.equalsIgnoreCase("Volvo") )
            this.model = model;
        else
            this.model= "Model Unknown";

    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
