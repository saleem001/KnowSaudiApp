package com.example.knowsaudi.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.knowsaudi.R;

import java.util.ArrayList;

public class LandmarksAdapter extends BaseAdapter {


    Context context;
    ArrayList<String> landsList;
    int[] images={R.drawable.almasmak,R.drawable.museum,R.drawable.wadi,R.drawable.kingabdullahpark};
    public LandmarksAdapter(Context context,ArrayList<String> landsList) {
        this.context=context;
        this.landsList = landsList;
    }

    @Override
    public int getCount() {
        return landsList.size();
    }

    @Override
    public Object getItem(int position) {
        return landsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view=convertView;
        if(convertView==null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.landmarklist,parent,false);
        }
            TextView name=view.findViewById(R.id.nameText);
            ImageView imageView=view.findViewById(R.id.imageView);
        ImageView delete=view.findViewById(R.id.deleteimage);
        if(delete!=null) {
            imageView.setImageResource(R.drawable.minus);
        }
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer index = (Integer) v.getTag();
                landsList.remove(position);
                notifyDataSetChanged();
            }
        });
        if(name!=null) {
            name.setText(landsList.get(position));
        }
        if(imageView!=null) {
            imageView.setImageResource(images[position]);
        }

        return view;
    }
}
