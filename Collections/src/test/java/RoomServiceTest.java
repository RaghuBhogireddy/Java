

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import model.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

class RoomServiceTest {

    RoomService service;

    Room cambridge = new Room("Cambridge", "Premiere Room", 3, 175.00);
    Room manchester = new Room("Manchester", "Suite", 5, 250.00);
    Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Room victoria = new Room("Victoria", "Suite", 5, 225.00);
    Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);

    @BeforeEach
    void setUp() throws Exception {

        this.service = new RoomService();

        this.service.createRoom("Piccadilly", "Guest Room", 3, 125.00);
        this.service.createRoom("Cambridge", "Premiere Room", 3, 175.00);
        this.service.createRoom("Victoria", "Suite", 5, 225.00);

    }

    @Test
    void testCreateRoom() {

        this.service.createRoom("Westminister", "Premiere Room", 4, 200.00);

        assertEquals(4, this.service.getInventory().size());
    }

    @Test
    void testCreateRooms() {
        Room[] newRooms = { this.westminister, this.oxford, this.manchester };

        this.service.createRooms(newRooms);

        assertEquals(6, this.service.getInventory().size());
    }

    @Test
    void testRemoveRoom() {

        this.service.removeRoom(new Room("Victoria", "Suite", 5, 225.00));

        assertEquals(2, this.service.getInventory().size());
        assertFalse(this.service.getInventory().contains(victoria));
    }

    @Test
    void testGetInventory() {
        assertNotNull(this.service.getInventory());
    }

    @Test
    void testHasRoom() {

        assertFalse(this.service.hasRoom(this.manchester));
        assertTrue(this.service.hasRoom(this.cambridge));
    }

    @Test
    void testAsArray() {

        Room[] rooms = this.service.asArray();

        assertEquals(3, rooms.length);
        assertEquals(this.piccadilly, rooms[0]);
        assertEquals(this.cambridge, rooms[1]);
        assertEquals(this.victoria, rooms[2]);

    }

    @Test
    void testGetByType() {

        Collection<Room> guestRooms = this.service.getByType("Premiere Room");

        assertEquals(1, guestRooms.size());
        assertTrue(guestRooms.stream()
                .allMatch(r -> r.getType().equals("Premiere Room")));
        assertEquals(3, this.service.getInventory().size());

    }

}