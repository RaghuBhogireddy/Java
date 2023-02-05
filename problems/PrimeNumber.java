

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 1031;
        System.out.println("The number is Prime (naivePrimeLogic): " + naivePrimeLogic(number));
        System.out.println("The number is Prime (efficientPrimeLogic): " + efficientPrimeLogic(number));
        System.out.println("The number is Prime (moreEfficientPrimeLogic): " + moreEfficientPrimeLogic(number));
    }

    private static boolean moreEfficientPrimeLogic(int number) {
        int count = 0;
        if (number == 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i*i <= number; i+=6){
            count ++;
            if (number % i == 0 || number % (i+2) == 0){
                System.out.println("Total count: " + count);
                return false;
            }
        }
        System.out.println("Total count: " + count);
        return true;
    }

    private static boolean efficientPrimeLogic(int number) {
        int count = 0;
        if(number == 1) return false;
        for(int i = 2; (i*i) < number; i++){
            count++;
            if(number % i == 0){
                System.out.println("Total count: " + count);
                return false;
            }
        }
        System.out.println("Total count: " + count);
        return true;
    }

    private static boolean naivePrimeLogic(int number) {
        int count = 0;
        if(number == 1)
            return false;
        for(int i = 2; i < number; i++){
            count++;
            if( number%i == 0){
                System.out.println("Total count: " + count);
                return false; 
            }   
        }
        System.out.println("Total count: " + count);
        return true;
    }
}
