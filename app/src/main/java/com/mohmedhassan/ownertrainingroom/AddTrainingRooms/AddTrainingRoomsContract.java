package com.mohmedhassan.ownertrainingroom.AddTrainingRooms;

/**
 * Created by MOHMED on 4/2/2019.
 */

public interface AddTrainingRoomsContract {

    interface view{

        void AddTrainingRooms();
        void AddRooms();
        void AddPhoto();
        void showProgress(boolean show);
        boolean isNameValid(String Name);
        boolean isCityValid(String City);
        boolean isAreaValid(String Area);
        boolean isAddressValid(String Address);
        boolean isPhoneValid(String phone);
        boolean isNumberOfRoomsValid(String NumberOfRooms);
        boolean isStartTimeValid(String StartTime);
        boolean isEndTimeValid(String EndTime);

        void showMessage(String message);
    }

    interface Presenter{


        void Creat_TrainingRooms(String Name,String City, String Area,String Address,String phone,String Image ,String Starttime,
                      String Endtime,String NumberRooms );
    }
}
