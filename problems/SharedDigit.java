public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(54, 23423));
    }

    public static boolean hasSharedDigit(int x, int y){
        if ((x >= 10 && x <= 99) && (y >= 10 && y <= 99)){
            int x_prefix = x % 10;
            x /= 10;
            int x_suffix = x % 10;
            int y_prefix = y % 10;
            y /= 10;
            int y_suffix = y % 10;
            if (x_suffix == y_suffix || x_suffix == y_prefix)
                return true;
            else return x_prefix == y_suffix || x_prefix == y_prefix;
        }else return false;
    }
}
