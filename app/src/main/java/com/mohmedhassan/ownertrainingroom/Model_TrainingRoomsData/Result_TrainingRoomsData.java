package com.mohmedhassan.ownertrainingroom.Model_TrainingRoomsData;

import com.google.gson.annotations.SerializedName;
import com.mohmedhassan.ownertrainingroom.Model_LoginAndRegister.User;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class Result_TrainingRoomsData {

    @SerializedName("error")
    private Boolean error;

    @SerializedName("message")
    private String message;

    @SerializedName("user")
    private User_TrainingRoomsData user_trainingRoomsData;

    public Result_TrainingRoomsData(Boolean error, String message, User_TrainingRoomsData user_trainingRoomsData) {
        this.error = error;
        this.message = message;
        this.user_trainingRoomsData = user_trainingRoomsData;
    }

    public Boolean getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public User_TrainingRoomsData getUser_trainingRoomsData() {
        return user_trainingRoomsData;
    }
}
