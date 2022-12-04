package io.codr.problems;

public class SpeedConverter {
    public static void main(String[] args){
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kiloMetersPerHour){
        if(kiloMetersPerHour < 0)
            return -1;
        return Math.round(kiloMetersPerHour * 0.621371);

    }

    public static void printConversion(double kiloMetersPerHour){
        long milesPerHour = toMilesPerHour(kiloMetersPerHour);
        if(milesPerHour == -1)
            System.out.println("Invalid Value");
        else System.out.println(kiloMetersPerHour + "km/h = " + milesPerHour + "mi/h");
    }
}
