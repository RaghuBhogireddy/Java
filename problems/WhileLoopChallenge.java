public class WhileLoopChallenge {
    public static void main(String[] args) {
        printEven();
    }

    public static boolean isEvenNumber(int number){
        if (number > 0)
            return number % 2 == 0;
        return false;
    }

    public static void printEven(){
        int number = 5;
        int count = 0;
        int oddCount = 0;
        while (number <= 20){
            if (isEvenNumber(number)){
                count ++;
                System.out.println(number + " is even");
            }else oddCount++;
            if (count == 5)
                break;
            number++;
        }
        System.out.println("Total Evens found: " + count + "\n" +
                "Total odds found: "+ oddCount);

    }
}
