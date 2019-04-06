package com.mohmedhassan.ownertrainingroom.AddRooms;

import android.content.Context;

/**
 * Created by MOHMED on 4/5/2019.
 */

public class AddRoomsPresenter implements AddRoomsContract.Presenter {

    Context context;
    AddRoomsContract.view mView;

    public AddRoomsPresenter(Context context, AddRoomsContract.view mView) {
        this.context = context;
        this.mView = mView;
    }


}
