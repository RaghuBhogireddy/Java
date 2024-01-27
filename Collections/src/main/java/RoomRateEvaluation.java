import model.Room;

import java.util.Collection;
import java.util.List;

public class RoomRateEvaluation {
    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.00);
        Room oxford = new Room("Oxford", "Guest Room", 3, 125.00);
        // Collections provide Extensibility without changing code when there is addition of data to be manipulated
        Room piccadilly = new Room("Piccadilly", "Premiere Room", 4, 175.00);

        Collection<Room> rooms = List.of(cambridge, manchester, piccadilly, oxford);
        double total = getPotentialRevenue(rooms);
        System.out.println(total);
    }

    private static double getPotentialRevenue(Collection<Room> rooms) {
        return rooms.stream()
                .mapToDouble(Room::getRate)
                .sum();
    }
}
