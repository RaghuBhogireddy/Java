public class MegaBytesConverter {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2500);
    }

    private static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            double megaBytes = convertKiloBytesToMegaBytes(kiloBytes);
            int remainingKiloBytes = 0;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes +" KB");
        }

    }

    private static double convertKiloBytesToMegaBytes(int kiloBytes) {
        // 1MB = 1024Kb
        return kiloBytes/1024;
    }
}
