package com.mohmedhassan.ownertrainingroom.Model_Login;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class UserLogin {

    int id;
    String  Email, Passwored;

    public UserLogin(int id, String email, String passwored) {
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
