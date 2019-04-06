package com.mohmedhassan.ownertrainingroom.Login;

import android.content.Context;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class LoginPresenter implements LoginContract.Presenter {

    Context mContext;
    LoginContract.view mView;

    public LoginPresenter(Context mcontext, LoginContract.view mView) {
        this.mContext = mcontext;
        this.mView = mView;
    }
}
