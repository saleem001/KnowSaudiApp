package com.example.knowsaudi.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.knowsaudi.R;
import com.example.knowsaudi.Models.TourGuideModel;

import java.util.List;

public class TourGuideAdapter extends ArrayAdapter<TourGuideModel> {


    public TourGuideAdapter(Context context, int resource) {
        super(context, resource);
    }


    public TourGuideAdapter(Context context, int resource, List<TourGuideModel> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            view = vi.inflate(R.layout.row_item, null);
        }
        TourGuideModel item = getItem(position);
        if (item != null) {

            TextView name = view.findViewById(R.id.nameText);
            TextView location = view.findViewById(R.id.locationText);
            ImageView imageView = view.findViewById(R.id.imageView);
            if (name != null) {
                name.setText(item.getName());
            }
            if (location != null) {
                location.setText(item.getLocation());
            }
            if (imageView != null) {
                imageView.setImageResource(item.getInamge());
            }
        }
        return view;
    }
}