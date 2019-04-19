package com.mohmedhassan.ownertrainingroom.Register;

public interface RegisterContract {

    interface view {

        void BtnRegister();
    }

    interface Presenter {

        void Register(String email, String password, String phone, String city, String District,String gender);
    }
}
