package com.shefaa;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * * Created by Ahmed Adel Al-Desouqy on 07-May-18.
 */

public class SpecialitiesAdapter extends RecyclerView.Adapter {

    private ArrayList<Speciality> specialities;

    public class SpecialitiesViewHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public ImageView logo;
        public LinearLayout container;

        public SpecialitiesViewHolder(View view) {
            super(view);
            container = (LinearLayout) view.findViewById(R.id.speciality_container);
            title = (TextView) view.findViewById(R.id.speciality_title);
            logo = (ImageView) view.findViewById(R.id.speciality_logo);
        }
    }

    public SpecialitiesAdapter(ArrayList<Speciality> specialities) {
        this.specialities = specialities;
    }

    @Override
    public SpecialitiesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_speciality, parent, false);

        return new SpecialitiesViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Speciality speciality = specialities.get(position);
        if (holder instanceof SpecialitiesViewHolder) {
            ((SpecialitiesViewHolder) holder).title.setText(speciality.getTitle());

            switch (position%6) {
                case 0:
                    ((SpecialitiesViewHolder) holder).container.setBackgroundResource(R.drawable.card1);
                    break;
                case 1:
                    ((SpecialitiesViewHolder) holder).container.setBackgroundResource(R.drawable.card2);
                    break;
                case 2:
                    ((SpecialitiesViewHolder) holder).container.setBackgroundResource(R.drawable.card3);
                    break;
                case 3:
                    ((SpecialitiesViewHolder) holder).container.setBackgroundResource(R.drawable.card4);
                    break;
                case 4:
                    ((SpecialitiesViewHolder) holder).container.setBackgroundResource(R.drawable.card5);
                    break;
                case 5:
                    ((SpecialitiesViewHolder) holder).container.setBackgroundResource(R.drawable.card6);
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return specialities.size();
    }

}
