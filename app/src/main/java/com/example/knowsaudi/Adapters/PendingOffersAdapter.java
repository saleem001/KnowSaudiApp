package com.example.knowsaudi.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.knowsaudi.BookingConfirmation;
import com.example.knowsaudi.Models.PendingOfferModel;
import com.example.knowsaudi.R;

import java.util.List;

public class PendingOffersAdapter extends ArrayAdapter<PendingOfferModel> {


    List<PendingOfferModel> arrayList;


    public PendingOffersAdapter(Context context, int resource) {
        super(context, resource);
    }



    public PendingOffersAdapter(Context context, int resource, List<PendingOfferModel> objects) {
        super(context, resource, objects);
        arrayList=objects;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        View view=convertView;
        if(view==null)
        {
            LayoutInflater vi;
            vi= LayoutInflater.from(getContext());
            view=vi.inflate(R.layout.driver,null);
        }
        PendingOfferModel item=getItem(position);
        if(item!=null)
        {
            TextView name=view.findViewById(R.id.nameText);
            TextView years=view.findViewById(R.id.yearsofexperience);
            TextView language=view.findViewById(R.id.language);
            TextView price=view.findViewById(R.id.price);
            TextView car=view.findViewById(R.id.car);

            ImageView cancel=view.findViewById(R.id.deleteimage);
            ImageView check=view.findViewById(R.id.checkimage);
            ImageView imageView=view.findViewById(R.id.imageView);

            if(name!=null)
            {
                name.setText(item.getName());
            }
            if(years!=null)
            {
                years.setText(item.getYearexperience());
            }
            if(language!=null)
            {
                language.setText(item.getLanguage());
            }
            if(price!=null)
            {
                price.setText(item.getPrice());
            }
            if(car!=null)
            {
                car.setText(item.getCar());
            }
            if(cancel!=null)
            {
                cancel.setImageResource(item.getImagecancel());
            }
            if(check!=null)
            {
                check.setImageResource(item.getImagecheck());
            }

            if(imageView!=null)
            {
                imageView.setImageResource(item.getImage());

            }
            cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Integer index = (Integer) v.getTag();
                    arrayList.remove(position);
                    notifyDataSetChanged();
                }
            });
            check.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(), BookingConfirmation.class);
                    v.getContext().startActivity(intent);
                }
            });
        }
        return view;
    }
}
