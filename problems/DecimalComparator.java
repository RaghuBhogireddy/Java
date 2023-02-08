public class DecimalComparator {
    public static void main(String[] args) {
        boolean equalByThreeDecimalPlaces =
                areEqualByThreeDecimalPlaces(3.1756, 3.1757);
        System.out.println(equalByThreeDecimalPlaces);
    }

    public static boolean areEqualByThreeDecimalPlaces(double v1, double v2){
        int v1_ = (int) (v1*1000);
        int v2_ = (int) (v2*1000);
        System.out.println("v1 & v2: " + v1_ + " " + v2_);
        return v1_ - v2_ == 0;
    }
}
