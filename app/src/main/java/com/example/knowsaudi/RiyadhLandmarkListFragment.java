package com.example.knowsaudi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.knowsaudi.Adapters.LandmarksAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RiyadhLandmarkListFragment extends Fragment {

    ArrayList<String> landsList;
    ListView listView;
    public RiyadhLandmarkListFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        landsList=new ArrayList<>();
        landsList.add("Almasmak Forest");
        landsList.add("National Museum");
        landsList.add("Wadi Hanifah");
        landsList.add("King Abdullah Park");
        View view=inflater.inflate(R.layout.fragment_riyadh_landmark_list, container, false);
        LandmarksAdapter landmarksAdapter=new LandmarksAdapter(getContext(),landsList);
        listView=view.findViewById(R.id.RiyadhList);
        listView.setAdapter(landmarksAdapter);
        getItem();
        return view;
    }

    public void getItem()
    {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(getContext(),SingleLandmark.class);
                String pos=Integer.toString(position);
                intent.putExtra("position",pos);
                startActivity(intent);
            }
        });
    }
}
