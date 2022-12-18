package io.codr.implementation;

import io.codr.implementation.model.BiCycle;
import io.codr.implementation.model.HeroBiCycle;

public class Main {
    public static void main(String[] args){
        BiCycle heroBiCycle = new HeroBiCycle();
        heroBiCycle.changeGear(3);
        heroBiCycle.speedUp(45);
        heroBiCycle.applyBrakes(40);
        heroBiCycle.printState();


    }
}
