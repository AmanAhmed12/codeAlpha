
package com.mycompany.hotelreservationsystem.Model;


public class Room {
    
     private int roomNumber;
    private String category;
    private boolean available;

    public Room(int roomNumber, String category, boolean available) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.available = available;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
