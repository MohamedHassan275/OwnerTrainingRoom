package com.mohmedhassan.ownertrainingroom.AddTrainingRooms;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.mohmedhassan.ownertrainingroom.AddRooms.AddRoomsActivity;
import com.mohmedhassan.ownertrainingroom.R;

import java.io.IOException;

public class AddTrainingRoomsActivity extends AppCompatActivity implements AddTrainingRoomsContract.view {

    ImageView image_Photo,imageView_Photo;
    Button Addphoto,AddRoomss,AddTrainingRooms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_training_rooms);

        AddTrainingRoomsActivity.this.setTitle("Add Rooms");


     //   imageView = findViewById(R.id.image_view);

        AddRoomss = findViewById(R.id.btn_addRooms);
        AddTrainingRooms = findViewById(R.id.btn_addTrainingRooms);
        image_Photo = findViewById(R.id.image_photo);
        imageView_Photo = findViewById(R.id.imageView_photo);


      // Addphoto.setOnClickListener(View->AddPhoto());
        AddRoomss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AddTrainingRoomsActivity.this, AddRoomsActivity.class);
                startActivity(intent);
            }
        });
        image_Photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i, 1);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK && data != null && data.getData() != null) {

            Uri uri = data.getData();

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                // Log.d(TAG, String.valueOf(bitmap));

                imageView_Photo.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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
