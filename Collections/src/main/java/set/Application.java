package set;

import model.Room;

import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.00);
        Room oxford = new Room("Oxford", "Guest Room", 3, 125.00);
        Room oxfordDuplicate = new Room("Oxford", "Guest Room", 3, 125.00);
        Room piccadilly = new Room("Piccadilly", "Premiere Room", 4, 175.00);

        Set<Room> rooms = new HashSet<>(); // HashSet doesn't guarantee the order. In that scenario LinkedHashSet can be used
        rooms.add(cambridge);
        rooms.add(piccadilly);
        rooms.add(manchester);
        rooms.add(oxford);
        rooms.add(oxford);
        rooms.add(oxfordDuplicate);

        Set<Room> immutableSet = Set.of(cambridge, manchester); // Set that was created with .of() are immutable Set

        // we can create an immutable set with copy of existing Set
        Set<Room> moreRooms = Set.copyOf(rooms);

        moreRooms.stream()
                .map(Room::getName)
                .forEach(System.out::println);
    }
}
