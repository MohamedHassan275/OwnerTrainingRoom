package com.mohmedhassan.ownertrainingroom.Register;

import android.content.Context;

public class RegisterPresenter implements RegisterContract.Presenter {

    Context mContext;
    RegisterContract.view mView;

    public RegisterPresenter(Context mContext, RegisterContract.view mView) {
        this.mContext = mContext;
        this.mView = mView;
    }

    @Override
    public void login(String email, String password, String phone, String city, String District, String gender) {

    }
}
