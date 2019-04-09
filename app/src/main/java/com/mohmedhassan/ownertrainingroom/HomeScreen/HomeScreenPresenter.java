package com.mohmedhassan.ownertrainingroom.HomeScreen;

import android.content.Context;

public class HomeScreenPresenter implements HomeScreenContact.Presenter {

    Context mContext;
    HomeScreenContact.view mView;

    public HomeScreenPresenter(Context mContext, HomeScreenContact.view mView) {
        this.mContext = mContext;
        this.mView = mView;
    }
}
