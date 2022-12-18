package io.codr.implementation.model;


public class HeroBiCycle extends BiCycle{

    String name;


    public void changeGear(int newGear) {
        System.out.println("This method is from child Class");
        gear =  newGear;
    }


    public void speedUp(int speedThatIncrement) {
        System.out.println("This method is from child Class");
        speed = speed + speedThatIncrement;
    }


    public void applyBrakes(int speedThatDecrement) {
        System.out.println("This method is from child Class");
        speed = speed - speedThatDecrement;
    }

    public void printState(){
        System.out.println("This method is from child Class");
        System.out.println("BiCycle{" +
                "name" + name +
                ", gear=" + gear +
                ", speed=" + speed +
                '}');
    }

}
