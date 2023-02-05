public class ForLoop {
    public static void main(String[] args) {
        double amount = 10_000;
        for(int rate = 1; rate < 10; rate++){
            System.out.println(amount + " at " + rate + "% interest rate: " + calculateInterest(amount, rate));

        }
    }

    private static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
