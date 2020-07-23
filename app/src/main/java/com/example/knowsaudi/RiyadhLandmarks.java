package com.example.knowsaudi;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.example.knowsaudi.Adapters.DrawerAdapter;

public class RiyadhLandmarks extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ListView listView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerAdapter drawerAdapter;
    RiyadhLandmarkListFragment riyadhLandmarkListFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riyadh_landmarks);

        riyadhLandmarkListFragment=new RiyadhLandmarkListFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.container, riyadhLandmarkListFragment);
        transaction.addToBackStack(null);

        transaction.commit();

        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#a5d6a7"));

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        listView=findViewById(R.id.list_drawer);
        DrawerAdapter drawerAdapter=new DrawerAdapter(this);
        listView.setAdapter(drawerAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
        actionBarDrawerToggle = new ActionBarDrawerToggle
                (
                        this,
                        drawerLayout,
                        R.string.navigation_drawer_open,
                        R.string.navigation_drawer_close
                )
        {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
