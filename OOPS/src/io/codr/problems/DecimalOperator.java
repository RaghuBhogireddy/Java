package io.codr.problems;

public class DecimalOperator {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }

    private static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
        return param1 == param2;
    }
}
