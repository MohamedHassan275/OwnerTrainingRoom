package com.mohmedhassan.ownertrainingroom.Login;

import android.content.Context;

import com.mohmedhassan.ownertrainingroom.Model_Login.APIServiceLogin;
import com.mohmedhassan.ownertrainingroom.Model_Login.APIUrl_Login;
import com.mohmedhassan.ownertrainingroom.Model_Login.Result_Login;
import com.mohmedhassan.ownertrainingroom.Model_Login.SessionManagerLogin;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class LoginPresenter implements LoginContract.Presenter {


    LoginContract.view mView;
    Context mContext;

    public LoginPresenter(LoginContract.view mView, Context mContext) {
        this.mView = mView;
        this.mContext = mContext;
    }

    @Override
    public void login(String email, String password) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIUrl_Login.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIServiceLogin service = retrofit.create(APIServiceLogin.class);


        Call<Result_Login> call = service.userLogin(email, password);

        call.enqueue(new Callback<Result_Login>() {
            @Override
            public void onResponse(Call<Result_Login> call, Response<Result_Login> response) {

                mView.showProgress(false);

                mView.showMessage(response.body().getMessage());

                if (!response.body().getError()) {

                    SessionManagerLogin.getInstance(mContext).createLoginSession(response.body().getUser());
                    mView.attemptLogin();
                }

            }

            @Override
            public void onFailure(Call<Result_Login> call, Throwable t) {

                mView.showProgress(false);
                mView.showMessage(t.getMessage());
            }
        });

    }

    }

