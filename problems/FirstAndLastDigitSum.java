public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(12121));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0)
            return -1;
        else{
            int suffix = number % 10;
            int prefix = 0;
            if (number / 10 == 0){
                return number * 2;
            }else {
                while (number > 0){
                    number = number / 10;
                    if (number > 0 && number / 10 == 0)
                        prefix = number;
                }
                return suffix + prefix;
            }

        }
    }
}
