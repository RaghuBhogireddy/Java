public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6,2) + "cm");
    }

    public static double convertToCentimeters(int height){
        return height * 2.54;
    }

    public static double convertToCentimeters(int height, int inches){
        return convertToCentimeters((height * 12) + inches);
    }

}
