package list;

import java.util.ArrayList;
import java.util.List;

public class ListApplication {
    public static void main(String[] args) {
        List<String> alphabets = new ArrayList<>();

        // Adding an Element

        alphabets.add("A");
        alphabets.add(1, "B");
        alphabets.add( "C");
        //alphabets.add( 10, "D"); // providing index greater size of list throws exception
        alphabets.addAll(List.of("D", "E", "F", "A"));
        String previousValue = alphabets.set(6, "G");// set a value by providing index, will return previous value
        System.out.println("previousValue : " + previousValue );
        alphabets.forEach(System.out::println);

        // Retrieving an element

        System.out.println(alphabets.get(3)); // get by index
        System.out.println(alphabets.indexOf("D")); // get index of object, if object doesn't exist -1 returned

        // Removing element

        alphabets.remove(6); // remove by index, return boolean
    }
}
