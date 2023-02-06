import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        int currentYear = 2023;
        try{
            System.out.println("--- getting input from console ---");
            getInputFromConsole(currentYear);
        }catch (NullPointerException e){
            System.out.println("--- getting input from scanner ---");
            getInputFromScanner(currentYear);
        }
    }

    private static void getInputFromScanner(int currentYear) {
        boolean validDob = false;
        int birthYear = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi There, what is your name ? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("May I know your birth Year ? ");
        do{
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + "and <= " + currentYear);
            try{
                birthYear = checkData(currentYear, scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("characters not allowed !!!");
            }
            validDob = birthYear > 0;
        }while (!validDob);

        System.out.println("So you are, " + birthYear +" years old !!");

    }

    private static void getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi There, what is your name ? ");
        System.out.println("Hello, " + name);
        String birthYear = System.console().readLine("May I know your birth Year ? ");
        System.out.println("So you are, " + (currentYear - Integer.parseInt(birthYear))+" years old !!");
    }

    public static int checkData(int currentYear, String birthYear){
        int dob = Integer.parseInt(birthYear);
        int minimumYear = currentYear - 125;
        if ((dob < minimumYear) || (dob > currentYear))
            return -1;
        return (currentYear - dob);
    }


}
