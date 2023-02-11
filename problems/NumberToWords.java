public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(987634);
    }

    public static void numberToWords(int number){
        if (number < 0)
            System.out.println("Invalid Value");
        else {
            number = reverse(number);
            while (number > 0){
                int offset = number % 10;
                String numberToWord = numberToWord(offset);
                System.out.println(numberToWord);
                number /= 10;
            }
        }
    }

    public static String numberToWord(int offset) {
        return switch (offset){
            case 1: yield "One";
            case 2: yield "Two";
            case 3: yield "Three";
            case 4: yield "Four";
            case 5: yield "Five";
            case 6: yield "Six";
            case 7: yield "Seven";
            case 8: yield "Eight";
            case 9: yield "Nine";
            default: yield "InValid";
        };
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number > 0){
            int offset = number % 10;
            reverse = (reverse * 10) + offset;
            number /= 10;
        }
        return reverse;
    }
}
