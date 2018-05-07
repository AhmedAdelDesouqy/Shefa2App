package com.shefaa;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * * Created by Ahmed Adel Al-Desouqy on 07-May-18.
 */

public class SpecialitiesHomeActivity extends AppCompatActivity {

    private ArrayList<Speciality> specialities = new ArrayList<>();
    private RecyclerView recyclerView;
    private SpecialitiesAdapter specialitiesAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialities);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_specialities);
        specialitiesAdapter = new SpecialitiesAdapter(specialities);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        initSpecialitiesData();
        recyclerView.setAdapter(specialitiesAdapter);


    }

    private void initSpecialitiesData() {
        Speciality speciality = new Speciality(R.drawable.teeth, "Dental");
        specialities.add(speciality);

        speciality = new Speciality(R.drawable.teeth, "Cardiology");
        specialities.add(speciality);

        speciality = new Speciality(R.drawable.teeth, "Dental");
        specialities.add(speciality);

        speciality = new Speciality(R.drawable.teeth, "Gynecology");
        specialities.add(speciality);

        speciality = new Speciality(R.drawable.teeth, "Obstetrics");
        specialities.add(speciality);

        speciality = new Speciality(R.drawable.teeth, "Surgery");
        specialities.add(speciality);

        specialitiesAdapter.notifyDataSetChanged();
    }
}
