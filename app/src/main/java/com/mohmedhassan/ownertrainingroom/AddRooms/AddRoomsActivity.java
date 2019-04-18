package com.mohmedhassan.ownertrainingroom.AddRooms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mohmedhassan.ownertrainingroom.AddTrainingRooms.AddTrainingRoomsActivity;
import com.mohmedhassan.ownertrainingroom.R;

public class AddRoomsActivity extends AppCompatActivity implements AddRoomsContract.view {

    Button AddRooms;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_rooms);

        AddRooms = findViewById(R.id.add_rooms_AddRooms);

        AddRooms.setOnClickListener(view->AddRooms());
    }


    @Override
    public void AddRooms() {

        Intent intent = new Intent(AddRoomsActivity.this, AddTrainingRoomsActivity.class);
        startActivity(intent);
        finish();
    }
}
