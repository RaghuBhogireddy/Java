public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-1234567));
    }

    public static int getEvenDigitSum(int number){
        int sum = 0;
        if (number < 0)
            return -1;
        while(number > 0){
            int offset = number % 10;
            if (offset % 2 == 0)
                sum += offset;
            number /= 10;

        }
        return sum;
    }
}
