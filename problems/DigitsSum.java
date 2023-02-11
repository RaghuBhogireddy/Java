public class DigitsSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(4353245));
    }

    public static int sumDigits(int number){
        int sum = 0;
        int offset = 0;
        if (number < 0)
            return -1;
        while (number > 0){
             offset = number % 10;
             sum += offset;
             number /= 10;
        }
        return sum;
    }
}
