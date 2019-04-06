package com.mohmedhassan.ownertrainingroom.ShowTrainingRooms;

import android.content.Context;

/**
 * Created by MOHMED on 4/2/2019.
 */

public class ShowTrainingRoomsPresenter implements ShowTrainingRoomsContract.Presenter {

    Context mContext;
    ShowTrainingRoomsContract.view mView;

    public ShowTrainingRoomsPresenter(Context mContext, ShowTrainingRoomsContract.view mView) {
        this.mContext = mContext;
        this.mView = mView;
    }
}
