package com.mohmedhassan.ownertrainingroom.Model_Login;

/**
 * Created by MOHMED on 4/2/2019.
 */
import com.google.gson.annotations.SerializedName;


public class Result_Login {

    @SerializedName("error")
    private Boolean error;

    @SerializedName("message")
    private String message;

    @SerializedName("user")
    private UserLogin user;

    public Result_Login(Boolean error, String message, UserLogin user) {
        this.error = error;
        this.message = message;
        this.user = user;
    }

    public Boolean getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public UserLogin getUser() {
        return user;
    }

}
