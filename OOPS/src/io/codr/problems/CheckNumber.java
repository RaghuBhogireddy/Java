package io.codr.problems;

public class CheckNumber {
    public static void main(String[] args){
        checkNumber(-3);
    }

    private static void checkNumber(int i) {
        if(i>0)
            System.out.println("positive");
        else if(i<0)
            System.out.println("negative");
        else
            System.out.println("zero");

        String s = (i > 0) ? "positive" : ((i < 0) ? "negative" : "zero");
        System.out.println(s);
    }
}
