package com.mohmedhassan.ownertrainingroom.AddTrainingRooms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.mohmedhassan.ownertrainingroom.AddRooms.AddRoomsActivity;
import com.mohmedhassan.ownertrainingroom.R;

public class AddTrainingRoomsActivity extends AppCompatActivity implements AddTrainingRoomsContract.view {

    ImageView imageView;
    Button Addphoto,AddRoomss,AddTrainingRooms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_training_rooms);

        AddTrainingRoomsActivity.this.setTitle("Add Rooms");


     //   imageView = findViewById(R.id.image_view);

        AddRoomss = findViewById(R.id.add_rooms);
        AddTrainingRooms = findViewById(R.id.add_training_room_AddRooms);


      // Addphoto.setOnClickListener(View->AddPhoto());
        AddRoomss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AddTrainingRoomsActivity.this, AddRoomsActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void AddTrainingRooms() {

    }

    @Override
    public void AddRooms() {

    }

    @Override
    public void AddPhoto() {

    }
}
