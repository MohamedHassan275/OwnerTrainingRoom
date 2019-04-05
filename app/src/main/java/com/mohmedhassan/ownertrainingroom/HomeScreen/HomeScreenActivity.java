package com.mohmedhassan.ownertrainingroom.HomeScreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mohmedhassan.ownertrainingroom.AddTrainingRooms.AddTrainingRoomsActivity;
import com.mohmedhassan.ownertrainingroom.Login.LoginActivity;
import com.mohmedhassan.ownertrainingroom.R;
import com.mohmedhassan.ownertrainingroom.ShowTrainingRooms.ShowRoomsActivity;

public class HomeScreenActivity extends AppCompatActivity implements HomeScreenContract.view{

    Button ShowTrainingRoom,AddTrainingRoom,Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        HomeScreenActivity.this.setTitle("Home Screen");

        ShowTrainingRoom = findViewById(R.id.show_training_room);
        AddTrainingRoom = findViewById(R.id.add_training_room_HomeScreen);
        Login = findViewById(R.id.login);

        ShowTrainingRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeScreenActivity.this, ShowRoomsActivity.class));

            }
        });
        AddTrainingRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeScreenActivity.this, AddTrainingRoomsActivity.class));

            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeScreenActivity.this, LoginActivity.class));

            }
        });

    }

    @Override
    public void ShowTrainingRooms() {

    }

    @Override
    public void AddTrainingRooms() {

    }

    @Override
    public void Login() {

    }
}
