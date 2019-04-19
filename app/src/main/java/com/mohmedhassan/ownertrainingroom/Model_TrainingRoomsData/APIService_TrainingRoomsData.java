package com.mohmedhassan.ownertrainingroom.Model_TrainingRoomsData;


import com.mohmedhassan.ownertrainingroom.Model_TrainingRoomsData.Result_TrainingRoomsData;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
/**
 * Created by MOHMED on 4/2/2019.
 */

public  interface APIService_TrainingRoomsData {

    @FormUrlEncoded
    @POST("vendor.php")
    Call<Result_TrainingRoomsData> insert_TrainingRooms(
            @Field("name") String name,
            @Field("city") String city,
            @Field("Area") String Area,
            @Field("Address") String Address ,
            @Field("Phone") String Phone,
            @Field("Image") String Image,
            @Field("Starttime ") String Starttime,
            @Field("Endtime ") String Endtime,
            @Field("Numberofrooms ") String Numberofrooms


    );
}
