public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        if (number < 0)
             number = -(number);
        int number_wip = number;
        while(number_wip != 0){
            int offset = number_wip % 10;
            reverse = (reverse * 10) + offset;
            number_wip /= 10;
        }
        return reverse == number;
    }

}
