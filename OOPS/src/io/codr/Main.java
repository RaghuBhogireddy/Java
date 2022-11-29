package io.codr;

public class Main {
    public static void main(String[] args) {
        //primitiveDataTypes();
        //primitiveChallenge();
        //floatAndDouble();
        //operatorChallenge();
        operatorChallenge_2();

    }

    static void primitiveDataTypes(){
        System.out.println("---- int primitive type ----");
        System.out.println("Max value: " + Integer.MAX_VALUE);
        System.out.println("Min value: "+ Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1); // Java uses 2s compliment to store negative numbers.
        System.out.println(Integer.MIN_VALUE - 1);
        //System.out.println(2147483648); the integer lateral is out of range.
        System.out.println("---- byte primitive type ----");
        System.out.println("Max value: " + Byte.MAX_VALUE);
        System.out.println("Min value: "+ Byte.MIN_VALUE);
        System.out.println("---- short primitive type ----");
        System.out.println("Max value: " + Short.MAX_VALUE);
        System.out.println("Min value: "+ Short.MIN_VALUE);
        System.out.println("---- long primitive type ----");
        System.out.println("Max value: " + Long.MAX_VALUE);
        System.out.println("Min value: "+ Long.MIN_VALUE);

    }

    static void primitiveChallenge(){
        byte myByte = 23;
        short myShort = 25;
        int myInt = 27;
        long myLong = 50000l + (10l*(myByte + myShort + myInt));
        System.out.println(myLong);

    }

    static void floatAndDouble(){
        float pound = 2.2f;
        double kg = 0.45359237d * pound;
        System.out.println(kg);
    }

    static void operatorChallenge(){
        int result = 10;
        result -= 5;
        result %= 5;
        System.out.println(result);
    }

    static void operatorChallenge_2(){
        double myDouble1 = 20.0d, myDouble2 = 80.0d;
        double result = myDouble1 + myDouble2 * 100.0;
        System.out.println(result);
        double remainder = (result % 40.0);
        System.out.println(remainder);
        boolean isRemainderNonZero = (remainder == 0.00) ? true : false;
        System.out.println(isRemainderNonZero);
        if (!isRemainderNonZero)
            System.out.println("Got some remainder");

    }
}
