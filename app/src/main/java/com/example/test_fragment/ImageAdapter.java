package com.example.test_fragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class    ImageAdapter extends BaseAdapter {
    private final String[] imageIds;
    private Context context;

    public ImageAdapter(String[] imageIds,Context context) {

        this.imageIds = imageIds;
        this.context=context;
    }
    @Override
    public int getCount() {
        return imageIds.length;
    }

    @Override
    public Object getItem(int position) {
        return imageIds[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_layout, parent, false);
        }

        ImageView ImageView=convertView.findViewById(R.id.grid_item_image);
        Picasso.get().load(imageIds[position]).resize(600,750).centerCrop().into(ImageView);
        return convertView;
    }
}
