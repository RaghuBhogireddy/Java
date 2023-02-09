public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDuration(65,145));
        System.out.println(getDuration(3945));
        System.out.println(getDuration(65,45));

    }

    public static String getDuration(int seconds){
        if (seconds < 0){
            return "inValid data fort the seconds(" + seconds + ")," +
                    "must be positive integer value ";
        }
        System.out.println(seconds);
        System.out.println(seconds / 60);
        System.out.println(seconds % 60);
        return getDuration(seconds / 60, seconds % 60) ;
    }

    public static String getDuration(int minutes, int seconds){
        if (minutes < 0){
            return "inValid data for the minutes(" + minutes + ")," +
                    "must be positive integer value ";
        }
        if (seconds <= 0 || seconds >= 59 ){
            return "inValid data fort the seconds(" + seconds + ")," +
                    "must be between 0 and 59 ";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }
}
