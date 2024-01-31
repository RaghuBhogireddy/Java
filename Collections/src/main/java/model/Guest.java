package model;

import java.util.ArrayList;
import java.util.List;

public class Guest {

    private String firstName;
    private String lastName;
    private boolean loyaltyProgramMember;
    private List<Room> preferredRooms = new ArrayList<>();

    public Guest(String firstName, String lastName, boolean loyaltyProgramMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.loyaltyProgramMember = loyaltyProgramMember;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isLoyaltyProgramMember() {
        return loyaltyProgramMember;
    }

    public List<Room> getPreferredRooms() {
        return preferredRooms;
    }


}
