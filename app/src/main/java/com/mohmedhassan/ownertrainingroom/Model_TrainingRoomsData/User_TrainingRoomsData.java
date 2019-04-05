package com.mohmedhassan.ownertrainingroom.Model_TrainingRoomsData;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class User_TrainingRoomsData {

    int image;
    String location, name_traning_room,area_traning_room,phone_traning_room,avalable_traning_room
            ,details_traning_room,city_training_room,number_of_rooms_traning_room;



    public User_TrainingRoomsData(int image, String location, String name_traning_room, String area_traning_room, String phone_traning_room,
                                  String avalable_traning_room, String details_traning_room, String city_training_room, String number_of_rooms_traning_room) {
        this.image = image;
        this.location = location;
        this.name_traning_room = name_traning_room;
        this.area_traning_room = area_traning_room;
        this.phone_traning_room = phone_traning_room;
        this.avalable_traning_room = avalable_traning_room;
        this.details_traning_room = details_traning_room;
        this.city_training_room = city_training_room;
        this.number_of_rooms_traning_room = number_of_rooms_traning_room;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName_traning_room() {
        return name_traning_room;
    }

    public void setName_traning_room(String name_traning_room) {
        this.name_traning_room = name_traning_room;
    }

    public String getArea_traning_room() {
        return area_traning_room;
    }

    public void setArea_traning_room(String area_traning_room) {
        this.area_traning_room = area_traning_room;
    }

    public String getPhone_traning_room() {
        return phone_traning_room;
    }

    public void setPhone_traning_room(String phone_traning_room) {
        this.phone_traning_room = phone_traning_room;
    }

    public String getAvalable_traning_room() {
        return avalable_traning_room;
    }

    public void setAvalable_traning_room(String avalable_traning_room) {
        this.avalable_traning_room = avalable_traning_room;
    }

    public String getDetails_traning_room() {
        return details_traning_room;
    }

    public void setDetails_traning_room(String details_traning_room) {
        this.details_traning_room = details_traning_room;
    }

    public String getCity_training_room() {
        return city_training_room;
    }

    public void setCity_training_room(String city_training_room) {
        this.city_training_room = city_training_room;
    }

    public String getNumber_of_rooms_traning_room() {
        return number_of_rooms_traning_room;
    }

    public void setNumber_of_rooms_traning_room(String number_of_rooms_traning_room) {
        this.number_of_rooms_traning_room = number_of_rooms_traning_room;
    }
}
