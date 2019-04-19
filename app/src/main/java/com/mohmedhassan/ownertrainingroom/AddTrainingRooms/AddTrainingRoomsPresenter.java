package com.mohmedhassan.ownertrainingroom.AddTrainingRooms;

import android.content.Context;



import com.mohmedhassan.ownertrainingroom.Model_TrainingRoomsData.APIService_TrainingRoomsData;
import com.mohmedhassan.ownertrainingroom.Model_TrainingRoomsData.APIUrl_TrainingRoomsData;
import com.mohmedhassan.ownertrainingroom.Model_TrainingRoomsData.Result_TrainingRoomsData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class AddTrainingRoomsPresenter implements AddTrainingRoomsContract.Presenter {

    Context mContext;
    AddTrainingRoomsContract.view mView;

    public AddTrainingRoomsPresenter(Context mContext, AddTrainingRoomsContract.view mView) {
        this.mContext = mContext;
        this.mView = mView;
    }


    @Override
    public  void Creat_TrainingRooms(String Name, String City, String Area, String Address, String phone, String Image, String Starttime, String Endtime, String NumberRooms) {

        Retrofit retrofit=new Retrofit.Builder().baseUrl(APIUrl_TrainingRoomsData.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .build();
        APIService_TrainingRoomsData apiService=retrofit.create(APIService_TrainingRoomsData.class);
        Call<Result_TrainingRoomsData> call=apiService.CreateTrainingRooms(Name,City,Area,Address,phone,Image,Starttime,Endtime,NumberRooms);
        call.enqueue(new Callback<Result_TrainingRoomsData>() {
            @Override
            public void onResponse(Call<Result_TrainingRoomsData> call, Response<Result_TrainingRoomsData> response) {
                mView.showProgress(false);
                mView.showMessage((response.body().getMessage()));

                if (!response.body().getError()) {


                }
            }

            @Override
            public void onFailure(Call<Result_TrainingRoomsData> call, Throwable t) {

                mView.showProgress(false);
            }
        });

    }
}
