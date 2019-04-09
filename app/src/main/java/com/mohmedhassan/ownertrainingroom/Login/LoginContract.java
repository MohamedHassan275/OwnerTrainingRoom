package com.mohmedhassan.ownertrainingroom.Login;

/**
 * Created by MOHMED on 4/2/2019.
 */

public interface LoginContract {

    interface view{

        void showMessage(String message);


        void showProgress(boolean show);

        boolean isEmailValid(String email);

        boolean isPasswordValid(String password);

        void BtnLogin();

        void attemptLogin();
    }

    interface Presenter{

        void login(String email, String password);
    }

}
