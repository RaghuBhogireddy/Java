package model;

public class Bike {
    
    private String make;
    private String model;
    private int mileage;

    public Bike(String make, String model, int mileage) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }
}
