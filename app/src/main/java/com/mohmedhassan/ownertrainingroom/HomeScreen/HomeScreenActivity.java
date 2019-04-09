package com.mohmedhassan.ownertrainingroom.HomeScreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.mohmedhassan.ownertrainingroom.AddTrainingRooms.AddTrainingRoomsActivity;
import com.mohmedhassan.ownertrainingroom.Login.LoginActivity;
import com.mohmedhassan.ownertrainingroom.R;
import com.mohmedhassan.ownertrainingroom.ShowTrainingRooms.ShowRoomsActivity;

public class HomeScreenActivity extends AppCompatActivity implements HomeScreenContact.view {

    Button Show_TrainingRooms,Add_TrainingRooms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Show_TrainingRooms = findViewById(R.id.btn_ShowTrainngRooms);
        Add_TrainingRooms = findViewById(R.id.btnAdd_TrainngRooms);

        Show_TrainingRooms.setOnClickListener(view->BtnShow_TrainingRooms());
        Add_TrainingRooms.setOnClickListener(view->BtnAdd_TrainingRooms());
    }

    @Override
    public void BtnShow_TrainingRooms() {

        Intent intent = new Intent(HomeScreenActivity.this, ShowRoomsActivity.class);
        startActivity(intent);

    }

    @Override
    public void BtnAdd_TrainingRooms() {
        Intent intent = new Intent(HomeScreenActivity.this, AddTrainingRoomsActivity.class);
        startActivity(intent);

    }
}
