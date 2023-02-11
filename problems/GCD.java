public class GCD {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(625, 125));
    }

    private static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;
        else {
            int gcd = 1;
            int end = second;
            if (first > second)
                end = first;
            for (int i = 1; i <= end; i++){
                if (first % i == 0 && second % i == 0)
                    gcd = i;
            }
            return gcd;
        }
    }
}
