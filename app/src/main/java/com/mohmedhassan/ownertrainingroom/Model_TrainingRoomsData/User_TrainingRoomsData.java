package com.mohmedhassan.ownertrainingroom.Model_TrainingRoomsData;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class User_TrainingRoomsData {

    int image;
    String  name_traning_room,city_traning_room,area_traning_room,mobile_traning_room,from_time_traning_room
            ,details_traning_room,to_time_traning_room,number_of_rooms_traning_room;

    public User_TrainingRoomsData(int image, String name_traning_room, String city_traning_room, String area_traning_room, String mobile_traning_room, String from_time_traning_room,
                                  String details_traning_room, String to_time_traning_room, String number_of_rooms_traning_room) {
        this.image = image;
        this.name_traning_room = name_traning_room;
        this.city_traning_room = city_traning_room;
        this.area_traning_room = area_traning_room;
        this.mobile_traning_room = mobile_traning_room;
        this.from_time_traning_room = from_time_traning_room;
        this.details_traning_room = details_traning_room;
        this.to_time_traning_room = to_time_traning_room;
        this.number_of_rooms_traning_room = number_of_rooms_traning_room;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName_traning_room() {
        return name_traning_room;
    }

    public void setName_traning_room(String name_traning_room) {
        this.name_traning_room = name_traning_room;
    }

    public String getCity_traning_room() {
        return city_traning_room;
    }

    public void setCity_traning_room(String city_traning_room) {
        this.city_traning_room = city_traning_room;
    }

    public String getArea_traning_room() {
        return area_traning_room;
    }

    public void setArea_traning_room(String area_traning_room) {
        this.area_traning_room = area_traning_room;
    }

    public String getMobile_traning_room() {
        return mobile_traning_room;
    }

    public void setMobile_traning_room(String mobile_traning_room) {
        this.mobile_traning_room = mobile_traning_room;
    }

    public String getFrom_time_traning_room() {
        return from_time_traning_room;
    }

    public void setFrom_time_traning_room(String from_time_traning_room) {
        this.from_time_traning_room = from_time_traning_room;
    }

    public String getDetails_traning_room() {
        return details_traning_room;
    }

    public void setDetails_traning_room(String details_traning_room) {
        this.details_traning_room = details_traning_room;
    }

    public String getTo_time_traning_room() {
        return to_time_traning_room;
    }

    public void setTo_time_traning_room(String to_time_traning_room) {
        this.to_time_traning_room = to_time_traning_room;
    }

    public String getNumber_of_rooms_traning_room() {
        return number_of_rooms_traning_room;
    }

    public void setNumber_of_rooms_traning_room(String number_of_rooms_traning_room) {
        this.number_of_rooms_traning_room = number_of_rooms_traning_room;
    }
}
