package com.example.knowsaudi.Adapters;

import android.content.Context;
import android.content.Intent;
import android.database.CrossProcessCursorWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.knowsaudi.R;

import java.util.List;

public class DrawerAdapter extends BaseAdapter {


    Context context;
    String[] menus;
    int[] images={R.drawable.ic_home_drawer_24dp,R.drawable.ic_person_black_24dp,R.drawable.ic_library_books_drawer_24dp,R.drawable.ic_tag_faces_drawer_24dp,R.drawable.ic_list_darwer_24dp,R.drawable.ic_settings_drawer_24dp};
    public DrawerAdapter(Context context) {
        this.context=context;
        this.menus = context.getResources().getStringArray(R.array.menuList);
    }

    @Override
    public int getCount() {
        return menus.length;
    }

    @Override
    public Object getItem(int position) {
        return menus[position];
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
            view=inflater.inflate(R.layout.drawer,parent,false);
        }
            TextView name=view.findViewById(R.id.nameText);
            ImageView imageView=view.findViewById(R.id.imageView);
            if(name!=null)
            {
                name.setText(menus[position]);
            }
            if(imageView!=null)
            {
                imageView.setImageResource(images[position]);
            }

        return view;
    }
}
