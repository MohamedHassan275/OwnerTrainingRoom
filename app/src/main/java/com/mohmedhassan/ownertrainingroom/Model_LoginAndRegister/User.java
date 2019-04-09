package com.mohmedhassan.ownertrainingroom.Model_LoginAndRegister;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class User {

    int id;
    String  Email, Passwored;

    public User(int id, String email, String passwored) {
        this.id = id;
        Email = email;
        Passwored = passwored;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return Email;
    }

    public String getPasswored() {
        return Passwored;
    }
}
