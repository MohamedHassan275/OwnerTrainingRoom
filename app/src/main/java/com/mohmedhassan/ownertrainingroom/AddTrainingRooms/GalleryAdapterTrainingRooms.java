package com.mohmedhassan.ownertrainingroom.AddTrainingRooms;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mohmedhassan.ownertrainingroom.R;

import java.util.ArrayList;

public class GalleryAdapterTrainingRooms extends RecyclerView.Adapter<GalleryAdapterTrainingRooms.CustomViewHolder> {

    private Context context;
    private ArrayList<String> imageModels;
    private ArrayList<Bitmap> bitmapArrayList;

    public GalleryAdapterTrainingRooms(Context context, ArrayList<String> imageModels, ArrayList<Bitmap> bitmapArrayList) {
        this.context = context;
        this.imageModels = imageModels;
        this.bitmapArrayList = bitmapArrayList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_image, viewGroup, false);
        return new GalleryAdapterTrainingRooms.CustomViewHolder(view);


    }


    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder myViewHolder, int position) {

        myViewHolder.Photo.setImageBitmap(bitmapArrayList.get(position));

    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {


        public ImageView Photo;


        public CustomViewHolder(android.view.View view) {
            super(view);

            Photo = (ImageView) view.findViewById(R.id.imageView_TrainingRooms);

        }
    }


    @Override
    public int getItemCount() {

        return bitmapArrayList.size();
    }
}
