package com.mohmedhassan.ownertrainingroom.HomeLoginAndContactUs;

import android.content.Context;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class HomeLoginAndContactUsPresenter implements HomeLoginAndContactUsContract.Presenter {


    Context mContext;
    HomeLoginAndContactUsContract.view mView;

    public HomeLoginAndContactUsPresenter(Context mcontext, HomeLoginAndContactUsContract.view mView) {
        this.mContext = mcontext;
        this.mView = mView;
    }
}
