package io.codr.problems;

public class BarkingDog {
    public static void main(String[] args){
        boolean shouldWakeUp = shouldWakeUp(true, -1);
        System.out.println(shouldWakeUp);
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if(isBarking && hourOfDay >= 0 ){
            if(hourOfDay < 8)
                return true;
            else return hourOfDay == 23;
        }else return false;
    }
}
