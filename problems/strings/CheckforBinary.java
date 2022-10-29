package problems.strings;

public class CheckforBinary {

    public static void main(String[] args){
        int valid = bool("75");
        System.out.println(valid);
    }


    static int bool(String str){
        if(str.contains("1") || str.contains("0")){
            return 1;
        }
        return 0;
    }
    
}
