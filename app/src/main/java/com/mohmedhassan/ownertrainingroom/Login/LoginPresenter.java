package com.mohmedhassan.ownertrainingroom.Login;

import android.content.Context;

import com.mohmedhassan.ownertrainingroom.Model_LoginAndRegister.APIService;
import com.mohmedhassan.ownertrainingroom.Model_LoginAndRegister.APIUrl;
import com.mohmedhassan.ownertrainingroom.Model_LoginAndRegister.Result;
import com.mohmedhassan.ownertrainingroom.Model_LoginAndRegister.SessionManagerLogin;

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
                .baseUrl(APIUrl.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService service = retrofit.create(APIService.class);


        Call<Result> call = service.Login(email, password);

        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {

                mView.showProgress(false);

                mView.showMessage(response.body().getMessage());

                if (!response.body().getError()) {

                    SessionManagerLogin.getInstance(mContext).createLoginSession(response.body().getUser());
                    mView.BtnLogin();
                }

            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

                mView.showProgress(false);
                mView.showMessage(t.getMessage());
            }
        });

    }

    }

