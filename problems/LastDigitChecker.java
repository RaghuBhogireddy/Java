public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) && isValid(y) && isValid(z)) {
            x = x % 10;
            y = y % 10;
            z = z % 10;
            return hasAnyTwoEqualElements(x, y, z);
        } else return false;
    }

    private static boolean hasAnyTwoEqualElements(int x, int y, int z) {
        return (x == y || x == z || y == z);
    }


    public static boolean isValid(int x) {
        return (x >= 10 && x <= 1000);
    }

}
