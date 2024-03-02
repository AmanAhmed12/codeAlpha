package com.mycompany.hotelreservationsystem.Model;

import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    
    private List<Room> rooms; 

    public ReservationSystem() {
       
        rooms = new ArrayList<>(); 
        rooms.add(new Room(101, "Standard", true));
        rooms.add(new Room(102, "Standard", true));
        rooms.add(new Room(201, "Suite", true));
        rooms.add(new Room(202, "Suite", true));
    }

    public List<Room> searchAvailableRooms(String category) {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getCategory().equalsIgnoreCase(category) && room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public boolean makeReservation(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                room.setAvailable(false);
                return true;
            }
        }
        return false;
    }

    public Room getRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}
