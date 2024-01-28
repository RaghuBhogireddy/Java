import model.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RoomService {
    // 1. Declare a Collection to store Room Inventory
    private Collection<Room> inventory;

    public RoomService() {

        // 2. Initialize Collection and assign it to the Room Inventory
        this.inventory = new LinkedHashSet<>();

    }

    public Collection<Room> getInventory(){

        // 3. Return the Room Inventory

        return new ArrayList<>(this.inventory); // to protect collection from modification
    }

    public void createRoom(String name, String type, int capacity, double rate) {

        // 4. Add a new Room to the Room Inventory using the provided parameters
        this.inventory.add(new Room(name, type, capacity, rate));

    }

    public void createRooms(Room[] rooms) {

        // 5. Add the Rooms provided in the Array to the Room Inventory
        this.inventory.addAll(Arrays.asList(rooms));

    }

    public void removeRoom(Room room) {

        // 6. Remove the provided Room from the Room Inventory
        this.inventory.remove(room);

    }

    public boolean hasRoom(Room room) {

        // 7. Returns a boolean that indicates if the Room Inventory contains a Room.

        return this.inventory.contains(room);
    }

    public Room[] asArray() {

        // 8. Returns all Rooms as an Array of Rooms in the **order** they were Added.

        return this.inventory.toArray(new Room[0]);
    }

    public Collection<Room> getByType(String type){

	/*
	   9. Return a new Collection of Rooms where Room#type matches the provided String.
		  The original Room Inventory collection MUST NOT BE MODIFIED.
	*/
        Collection<Room> copy = new HashSet<>(this.inventory);
        copy.removeIf(r -> !r.getType().equals(type));
        return copy;
    }

    public void applyDiscount(final double discount) {

        //Reduces the rate of each room by the provided discount
        this.inventory.forEach(room -> room.setRate(room.getRate() * (1 - discount)));

    }

    public Collection<Room> getRoomsByCapacity(final int requiredCapacity) {

        //Returns a new collection of rooms that meet or exceed the provided capacity
        Collection<Room> matches = new HashSet<>();
        for (Room room : this.inventory) {
            if (room.getCapacity() >= requiredCapacity)
                matches.add(room);
        }
        return matches;

    }

    public Collection<Room> getRoomByRateAndType(final double rate, final String type){

        //Returns a new collection of rooms with a rate below the provided rate and that match the provided type
        return this.inventory.stream()
                .filter(room -> room.getRate() < rate)
                .filter(room -> room.getType().equals(type))
                .toList();

    }
}
