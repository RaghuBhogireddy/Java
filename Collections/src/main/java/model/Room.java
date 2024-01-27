package model;

import java.util.Objects;

public class Room {
    private String name;
    private String type;
    private int capacity;
    private double rate;

    public Room(String name, String type, int capacity, double rate) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(name, room.name) 
                && Objects.equals(type, room.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, capacity, rate);
    }
}
