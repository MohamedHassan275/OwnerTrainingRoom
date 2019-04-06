package com.mohmedhassan.ownertrainingroom.Model_AddRooms;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class User_AddRooms {

    int image;
    String  RoomName,NumberOfChair,Price,From_Rooms,To_Rooms,avalable_Rooms;

    public User_AddRooms(int image, String roomName, String numberOfChair, String price, String from_Rooms, String to_Rooms) {
        this.image = image;
        RoomName = roomName;
        NumberOfChair = numberOfChair;
        Price = price;
        From_Rooms = from_Rooms;
        To_Rooms = to_Rooms;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String roomName) {
        RoomName = roomName;
    }

    public String getNumberOfChair() {
        return NumberOfChair;
    }

    public void setNumberOfChair(String numberOfChair) {
        NumberOfChair = numberOfChair;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getFrom_Rooms() {
        return From_Rooms;
    }

    public void setFrom_Rooms(String from_Rooms) {
        From_Rooms = from_Rooms;
    }

    public String getTo_Rooms() {
        return To_Rooms;
    }

    public void setTo_Rooms(String to_Rooms) {
        To_Rooms = to_Rooms;
    }
}
