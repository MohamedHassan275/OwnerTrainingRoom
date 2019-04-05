package com.mohmedhassan.ownertrainingroom.ShowTrainingRooms;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.mohmedhassan.ownertrainingroom.R;

public class ShowRoomsActivity extends AppCompatActivity implements ShowTrainingRoomsContract.view{



    TextView location, name_traning_room,area_traning_room,phone_traning_room,avalable_traning_room
            ,details_traning_room,city_training_room,number_of_rooms_traning_room;
    RatingBar ratingBar_room;
    ImageView phone_call,share_phone,photo_traning_room;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_rooms);

        ShowRoomsActivity.this.setTitle("Training Room");

        location = (TextView)findViewById(R.id.location_traning_room);
        name_traning_room = (TextView)findViewById(R.id.name_traning_room);
        area_traning_room = (TextView)findViewById(R.id.area_traning_room);
        phone_traning_room = (TextView)findViewById(R.id.phone_traning_room);
        avalable_traning_room = (TextView)findViewById(R.id.avalable_traning_room);
        details_traning_room = (TextView)findViewById(R.id.details_traning_room);
        city_training_room = (TextView)findViewById(R.id.city_training_room);
        number_of_rooms_traning_room = (TextView)findViewById(R.id.number_of_rooms_traning_room);
        location = (TextView)findViewById(R.id.location_traning_room);
      /*  phone_call = (ImageView)findViewById(R.id.phone_call);
        share_phone = (ImageView)findViewById(R.id.share_phone);*/
        ratingBar_room = (RatingBar) findViewById(R.id.ratingBar_room);

        name_traning_room.setText("Mohamed Hassan");
        area_traning_room.setText("Nasr City");
        phone_traning_room.setText("01156043662");
        avalable_traning_room.setText("From 12 pm to 12 Am");
        details_traning_room.setText("details");
        city_training_room.setText("Cairo");
        number_of_rooms_traning_room.setText("Number Of Rooms : 9 Rooms");
        ratingBar_room.setRating(Float.parseFloat(String.valueOf(4.5)));
    }


    @Override
    public void ShareMobileNumber() {


    }

    @Override
    public void CallMobilNumber() {


    }
}
