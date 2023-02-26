public class Formatters {
    public static void main(String[] args) {
        String normalTextBlock = "This is main point\n " +
                "\u2022 This is sub point\n " +
                "   \u2022 This is sub to sub point";
        System.out.println(normalTextBlock);
        System.out.println("------------");

        String textBlock = """
                This is main point
                    \u2022 This is sub point
                        \u2022 This is sub to sub point""";
        System.out.println(textBlock);
        System.out.println("------------");

        //System.out.println("Hello there !!, %d", 25); - This is not possible with println()
        String name = "raghu";
        System.out.printf("Hello there !!, %s%n", name);
        System.out.printf("The age is %d%n", 45); //Inorder to output statement in new line, use %n
        System.out.printf("The age is %.2f%n", (float)45); //decide decimal places by giving .followed by number of decimals
        System.out.printf("This number will take 6 decimal places, %6d%n", 10); // decide decimal places a number can take by providing// number btw % and format specifier
        System.out.println("------------");

        String sample = String.format("can write this format as well, %s", "raghu");
        System.out.println(sample);
        String anotherSample = "Can write in this format too, %s".formatted(" raghu");
        System.out.println(anotherSample);


    }
}
