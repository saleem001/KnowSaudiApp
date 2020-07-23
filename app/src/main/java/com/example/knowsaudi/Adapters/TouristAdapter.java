package com.example.knowsaudi.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.knowsaudi.R;
import com.example.knowsaudi.Models.TouristModel;

import java.util.List;

public class TouristAdapter extends ArrayAdapter<TouristModel> {


    public TouristAdapter(Context context, int resource) {
        super(context, resource);
    }



    public TouristAdapter(Context context, int resource, List<TouristModel> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        View view=convertView;
        if(view==null)
        {
            LayoutInflater vi;
            vi= LayoutInflater.from(getContext());
            view=vi.inflate(R.layout.row_item,null);
        }
        TouristModel item=getItem(position);
        if(item!=null)
        {

            TextView name=view.findViewById(R.id.nameText);
            TextView location=view.findViewById(R.id.locationText);
            ImageView imageView=view.findViewById(R.id.imageView);
            if(name!=null)
            {
                name.setText(item.getName());
            }
            if(location!=null)
            {
                location.setText(item.getLocation());
            }
            if(imageView!=null)
            {
                imageView.setImageResource(item.getInamge());
            }
        }
        return view;
    }
}
