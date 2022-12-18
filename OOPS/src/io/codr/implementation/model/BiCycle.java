package io.codr.implementation.model;

public class BiCycle {
    int gear = 1;
    int speed = 0;

    public void changeGear(int newGear){
        System.out.println("This method is from Base Class");
        gear =  newGear;
    }

    public void speedUp(int speedThatIncrement){
        System.out.println("This method is from Base Class");
        speed = speed + speedThatIncrement;

    }

    public void applyBrakes(int speedThatDecrement){
        System.out.println("This method is from Base Class");
        speed = speed - speedThatDecrement;
    }

    public void printState(){
        System.out.println("This method is from Base Class");
        System.out.println("BiCycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}');
    }


    public String toString() {
        return "BiCycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }


}
