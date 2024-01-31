package set;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetApplication {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1000, 500, 230, 450, 120, 324, 541, 23, 46);

        NavigableSet<Integer> treeSet = new TreeSet<>(integers);

        treeSet.forEach(System.out::println); // default ascending order
        System.out.println("-------------");
        treeSet.descendingSet().forEach(System.out::println); // in descending order
        System.out.println("--------------");
        treeSet.headSet(500).forEach(System.out::println); // get all the elements below the 500
        System.out.println("--------------");
        treeSet.tailSet(500).forEach(System.out::println); // get all the elements above the 500
        System.out.println("--------------");
        System.out.println(treeSet.higher(500)); // get element just  above 500
        System.out.println("--------------");
        System.out.println(treeSet.lower(500)); // get element just  below 500
        System.out.println("--------------");
        treeSet.subSet(120, 500).forEach(System.out::println); // get elements b/w the given fromKey and toKey







    }
}
