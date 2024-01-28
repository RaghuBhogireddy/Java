import model.Room;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IteratingCollections {
    public static void main(String[] args) {
        List<Room> rooms = getList();
        Iterator<Room> iterator = rooms.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().getName());
//        }
//
//        for (Room room : rooms) {
//            System.out.println(room.getName());
//        }

        rooms.stream()
                .filter(new Predicate<Room>() {
                    @Override
                    public boolean test(Room room) {
                        return room.isPetFriendly();
                    }
                }).forEach(new Consumer<Room>() {
                    @Override
                    public void accept(Room room) {
                        System.out.println(room.getName());
                    }
                });

        System.out.println("======= Get Room Names that are PetFriendly =======");

        List<Room> petFriendly = rooms.stream()
                .filter(Room::isPetFriendly)
                .toList();

        petFriendly.stream()
                .map(Room::getName)
                .forEach(System.out::println);

        System.out.println("======= Get Room Names that are PetFriendly =======");

        double sum = petFriendly.stream()
                .mapToDouble(Room::getRate)
                .sum();
        System.out.println(sum);
    }

    private static List<Room> getList() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("Cambridge", "Premiere Room", 4, 175.00));
        rooms.add(new Room("Manchester", "Suite", 5, 250.00));
        Room oxford = new Room("Oxford", "Guest Room", 3, 125.00);
        oxford.setPetFriendly(true);
        rooms.add(oxford);
        Room piccadilly = new Room("Piccadilly", "Premiere Room", 4, 175.00);
        piccadilly.setPetFriendly(true);
        rooms.add(piccadilly);
        return rooms;
    }
}
