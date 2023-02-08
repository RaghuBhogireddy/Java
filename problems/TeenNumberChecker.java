public class TeenNumberChecker {
    public static void main(String[] args) {

        System.out.println(hasTeen(23,22,24));
        System.out.println(isTeen(15));
    }

    public static boolean hasTeen(int age_1, int age_2, int age_3){
        if (age_1 >= 13 && age_1 <= 19)
            return true;
        else if (age_2 >= 13 && age_2 <= 19)
            return true;
        else return age_3 >= 13 && age_3 <= 19;
    }

    public static boolean isTeen(int age){
        return age >= 13 && age <= 19;
    }
}
