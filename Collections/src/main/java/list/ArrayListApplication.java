package list;

import model.Guest;
import java.util.ArrayList;
import java.util.List;

public class ArrayListApplication {
    public static void main(String[] args) {


        Guest sam = new Guest("Sam", "C", true);
        Guest john = new Guest("John", "D", false);
        Guest mike = new Guest("Mike", "S", true);
        Guest maria = new Guest("Maria", "S", true);
        Guest rick = new Guest("Rick", "S", true);

        List<Guest> checkInList = new ArrayList<>(100);
        checkInList.add(sam);
        checkInList.add(john);
        print(checkInList);

        checkInList.add(1, mike);
        print(checkInList);

        checkInList.addAll(2, List.of(maria, rick));
        print(checkInList);





    }

    public static void print(List<Guest> list) {
        System.out.format("%n-- List Content --%n");

        for (int x = 0; x < list.size(); x++) {
            Guest guest = list.get(x);
            System.out.format("%x: %s%n", x, guest.getFirstName());
        }
    }
}
