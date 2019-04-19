package com.mohmedhassan.ownertrainingroom.AddTrainingRooms;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.mohmedhassan.ownertrainingroom.AddRooms.AddRoomsActivity;
import com.mohmedhassan.ownertrainingroom.R;

import java.io.IOException;
import java.util.ArrayList;

public class AddTrainingRoomsActivity extends AppCompatActivity implements AddTrainingRoomsContract.view {

    RecyclerView recyclerview_image;
    private View mProgressView;
    private TextInputLayout NameInput,CityInput,AreaInput,AddressInput,phoneInput,NumberOfRoomsInput,StartTimeInput,EndTimeInput;
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
        mProgressView = findViewById(R.id.m_progress);
        NameInput = findViewById(R.id.InputLayout_name);
        CityInput = findViewById(R.id.InputLayout_city);
        AreaInput = findViewById(R.id.InputLayout_area);
        AddressInput = findViewById(R.id.InputLayout_address);
        phoneInput = findViewById(R.id.InputLayout_phone);
        NumberOfRoomsInput = findViewById(R.id.InputLayout_numberOfRooms);
        StartTimeInput = findViewById(R.id.InputLayout_startTime);
        EndTimeInput = findViewById(R.id.InputLayout_endTime);

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


    @Override
    public void showProgress(boolean show) {

        mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
    }

    @Override
    public boolean isNameValid(String Name) {
        return Name.length()<0;
    }

    @Override
    public boolean isCityValid(String City) {
        return City.length()<0;
    }

    @Override
    public boolean isAreaValid(String Area) {
        return Area.length()<0;
    }

    @Override
    public boolean isAddressValid(String Address) {
        return Address.length()<0;
    }

    @Override
    public boolean isPhoneValid(String phone) {
        return phone.length()>11;
    }

    @Override
    public boolean isNumberOfRoomsValid(String NumberOfRooms) {
        return NumberOfRooms.length()<0;
    }

    @Override
    public boolean isStartTimeValid(String StartTime) {
        return StartTime.length()>24;
    }

    @Override
    public boolean isEndTimeValid(String EndTime) {
        return EndTime.length()>24;
    }

    @Override
    public void showMessage(String message) {

        Toast.makeText(AddTrainingRoomsActivity.this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void AddTrainingRooms() {

        NameInput.setError(null);
        CityInput.setError(null);
        AreaInput.setError(null);
        AddressInput.setError(null);
        phoneInput.setError(null);
        NumberOfRoomsInput.setError(null);
        StartTimeInput.setError(null);
        EndTimeInput.setError(null);
        //   ConfirmPasswordInput.setError(null);


        String nameStr=NameInput.getEditText().getText().toString();
        String cityStr=CityInput.getEditText().getText().toString();
        String areaStr=AreaInput.getEditText().getText().toString();
        String addressStr=AddressInput.getEditText().getText().toString();
        String phoneStr=phoneInput.getEditText().getText().toString();
        String numberOfRoomsStr=NumberOfRoomsInput.getEditText().getText().toString();
        String startTimeStr=StartTimeInput.getEditText().getText().toString();
        String endTimeStr=EndTimeInput.getEditText().getText().toString();

        boolean cancel = false;
        View focusView = null;

        if(TextUtils.isEmpty(nameStr)){
            NameInput.setError(getString(R.string.error_field_required));
            focusView = NameInput;
            cancel = true;
        }else if(!TextUtils.isEmpty(nameStr) && !isNameValid(nameStr)){
            NameInput.setError(getString(R.string.error_field_required));
            focusView = NameInput;
            cancel = true;
        }
        // Check for a valid email address.
        if (TextUtils.isEmpty(cityStr)) {
            CityInput.setError(getString(R.string.error_field_required));
            focusView = CityInput;
            cancel = true;
        } else if (!isCityValid(cityStr)) {
            CityInput.setError(getString(R.string.error_invalid_email));
            focusView = CityInput;
            cancel = true;
        }
        // Check for a valid password, if the user entered one.
        if (TextUtils.isEmpty(areaStr)) {
            AreaInput.setError(getString(R.string.error_field_required));
            focusView = AreaInput;
            cancel = true;
        }else if (!isAreaValid(cityStr)) {
            AreaInput.setError(getString(R.string.error_invalid_email));
            focusView = AreaInput;
            cancel = true;
        }
        // Check for a valid phone, if the user entered one.
        if (TextUtils.isEmpty(addressStr)) {
            AddressInput.setError(getString(R.string.error_field_required));
            focusView = AddressInput;
            cancel = true;
        } else if (!isAddressValid(addressStr)) {
            AddressInput.setError(getString(R.string.error_invalid_email));
            focusView = AddressInput;
            cancel = true;
        }
        // Check for a valid City, if the user entered one.
        if (TextUtils.isEmpty(phoneStr)) {
            phoneInput.setError(getString(R.string.error_field_required));
            focusView = phoneInput;
            cancel = true;
        } else if (!isPhoneValid(phoneStr)) {
            phoneInput.setError(getString(R.string.error_invalid_email));
            focusView = phoneInput;
            cancel = true;
        }
        if (TextUtils.isEmpty(numberOfRoomsStr)) {
            NumberOfRoomsInput.setError(getString(R.string.error_field_required));
            focusView = NumberOfRoomsInput;
            cancel = true;
        } else if (!isNumberOfRoomsValid(numberOfRoomsStr)) {
            NumberOfRoomsInput.setError(getString(R.string.error_invalid_email));
            focusView = NumberOfRoomsInput;
            cancel = true;
        }
        if (TextUtils.isEmpty(startTimeStr)) {
            StartTimeInput.setError(getString(R.string.error_field_required));
            focusView = StartTimeInput;
            cancel = true;
        } else if (!isStartTimeValid(startTimeStr)) {
            StartTimeInput.setError(getString(R.string.error_invalid_email));
            focusView = StartTimeInput;
            cancel = true;
        }
        if (TextUtils.isEmpty(endTimeStr)) {
            EndTimeInput.setError(getString(R.string.error_field_required));
            focusView = EndTimeInput;
            cancel = true;
        } else if (!isEndTimeValid(endTimeStr)) {
            EndTimeInput.setError(getString(R.string.error_invalid_email));
            focusView = EndTimeInput;
            cancel = true;
        }

        if(cancel){
            focusView.requestFocus();
        }else {
            showProgress(true);


            Toast.makeText(this,"Send Data done!",Toast.LENGTH_SHORT).show();

        }


    }

}
