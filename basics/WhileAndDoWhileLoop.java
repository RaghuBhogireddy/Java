

public class WhileAndDoWhileLoop {
    public static void main(String[] args) {
        double amount = 10_000;
        int rate = 1;
        System.out.println("--- while loop ---");
        whileLoop(amount,rate);
        System.out.println("--- do while loop ---");
        doWhileLoop(amount, rate);

    }

    private static void doWhileLoop(double amount, int rate) {
        do{
            System.out.println(amount + " at " + rate + "% interest rate: " + calculateInterest(amount, rate));
            rate ++;
        }while (rate < 5);
    }

    private static void whileLoop(double amount, double rate) {
        while(rate < 5){
            System.out.println(amount + " at " + rate + "% interest rate: " + calculateInterest(amount, rate));
            rate ++;
        }
    }

    private static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }
}
