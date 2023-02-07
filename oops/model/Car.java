package model;

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getDoors(){
        return doors;
    }

    public void setMake(String make){
        if(make == null ) make ="Unknown";
        String makeLowerCase = make.toLowerCase();
        switch (makeLowerCase){
            case "holden", "porsche", "tesla" -> this.make = makeLowerCase;
            default -> {
                this.make = "UnSupported";
            }
        }
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = model;
    }

    public void setConvertible(boolean convertible){
        this.convertible = convertible;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public void describeCar(){
        System.out.println(make + " " +
                model + " " +
                color + " " +
                doors + "-Doors " +
                (convertible ? "Convertible" : ""));
    }
}
