public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else {
            /*
            1 hour = 60 minutes
            1 day = 24 hours = 24 * 60
            1 year = 365 days = 365 * 24 * 60
         */

            long years = minutes / (365 * 24 * 60);
            long remainingMinutes = minutes % (365 * 24 * 60);
            long days = remainingMinutes / (24 * 60);
            System.out.println(minutes + " min = " + years + " y and " + days +" d");
        }

    }
}
