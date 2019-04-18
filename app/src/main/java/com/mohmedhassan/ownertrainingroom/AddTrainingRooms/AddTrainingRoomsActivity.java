package com.mohmedhassan.ownertrainingroom.AddTrainingRooms;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.mohmedhassan.ownertrainingroom.AddRooms.AddRoomsActivity;
import com.mohmedhassan.ownertrainingroom.R;

import java.io.IOException;
import java.util.ArrayList;

public class AddTrainingRoomsActivity extends AppCompatActivity implements AddTrainingRoomsContract.view {

    RecyclerView recyclerview_image;
    ImageView imageView_Photo;
    Button AddRoomss,AddTrainingRooms;
    private final static int PICK_IMAGE_REQUEST = 1;
    Context context;
    private GalleryAdapterTrainingRooms galleryAdapterTrainingRooms;
    private ArrayList<String> imageModels = new ArrayList<>();
    private ArrayList<Bitmap> bitmaparraylist = new ArrayList<Bitmap>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_training_rooms);

        AddTrainingRoomsActivity.this.setTitle("Add Rooms");


     //   imageView = findViewById(R.id.image_view);

        recyclerview_image = findViewById(R.id.recyclerview_image);
        AddRoomss = findViewById(R.id.btn_addRooms);
        AddTrainingRooms = findViewById(R.id.btn_addTrainingRooms);
        imageView_Photo = findViewById(R.id.imageView_photo);


        galleryAdapterTrainingRooms = new GalleryAdapterTrainingRooms(context,imageModels, bitmaparraylist);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context,
                LinearLayoutManager.HORIZONTAL, false);
        recyclerview_image.setLayoutManager(mLayoutManager);
        recyclerview_image.setAdapter(galleryAdapterTrainingRooms);
        galleryAdapterTrainingRooms.notifyDataSetChanged();


        AddRoomss.setOnClickListener(view->AddRooms());
        imageView_Photo.setOnClickListener(view->AddPhoto());
        AddTrainingRooms.setOnClickListener(view->AddTrainingRooms());

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {

            Uri uri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);

                bitmaparraylist.add(bitmap);
                galleryAdapterTrainingRooms.notifyDataSetChanged();

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

        Intent intent = new Intent(AddTrainingRoomsActivity.this, AddRoomsActivity.class);
        startActivity(intent);

    }

    @Override
    public void AddPhoto() {

        Intent i = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(i, PICK_IMAGE_REQUEST);
        
    }
}
