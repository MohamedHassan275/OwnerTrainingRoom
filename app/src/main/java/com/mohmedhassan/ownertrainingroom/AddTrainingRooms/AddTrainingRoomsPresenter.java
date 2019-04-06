package com.mohmedhassan.ownertrainingroom.AddTrainingRooms;

import android.content.Context;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class AddTrainingRoomsPresenter implements AddTrainingRoomsContract.Presenter {

    Context mContext;
    AddTrainingRoomsContract.view mview;

    public AddTrainingRoomsPresenter(Context mContext, AddTrainingRoomsContract.view mview) {
        this.mContext = mContext;
        this.mview = mview;
    }
}
