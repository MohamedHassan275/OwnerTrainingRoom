package com.mohmedhassan.ownertrainingroom.HomeScreen;

import android.content.Context;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class HomeScreenPresenter implements HomeScreenContract.Presenter {


    Context mContext;
    HomeScreenContract.view mView;

    public HomeScreenPresenter(Context mcontext, HomeScreenContract.view mView) {
        this.mContext = mcontext;
        this.mView = mView;
    }
}
