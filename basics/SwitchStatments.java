public class SwitchStatments {
    /*
     * Switch Statements are one of the four important Statements in java. 
     * Other being for, while, do while
     * 
     */
    public static void main(String[] args){
        int value = 7;
        //enhancedSwitchStatements(value);
        // traditionalSwitchStatement(value);
        /*
         * Traditional switch statements can return values using return keyword
         * but the enhanced switch statements have different syntax altogether
         */
        String month = "JAN";
        String result = enhancedSwitchStatementsWithReturn(month);
        if(result.equals("month is bad"))
            System.out.println("given month is bad");
        else
            System.out.println("month: " + month + " is in " + result + " quarter of the year"); ;
        
    }

    private static String enhancedSwitchStatementsWithReturn(String month) {
        return switch(month){
            case "JAN", "FEB", "MAR" -> "1st";
            case "APR", "MAY", "JUN" -> "2nd";
            case "JUL", "AUG", "SEP" -> "3rd";
            case "OCT", "NOV", "DEC" -> "4th";
            default -> {
                yield "month is bad" ;
            }
        };
    }

    private static void traditioxnalSwitchStatement(int value) {
        switch(value){
            case 1, 2, 3:
                System.out.println("the value got: " + value);
                break;
            case 4: case 5: case 6:
                System.out.println("the Actual value got: " + value);
            default:
                System.out.println("it was neither of the above given cases");
                break;

        }
    }

    private static void enhancedSwitchStatements(int value) {
        switch(value){
            case 1 -> System.out.println("the value got: " + value);
            case 2 -> System.out.println("the value got: " + value);
            case 3, 4, 5 -> {
                System.out.println("the Actual value got: " + value);
            }
            default -> System.out.println("it was neither of the above given cases");
        }
    }


}
