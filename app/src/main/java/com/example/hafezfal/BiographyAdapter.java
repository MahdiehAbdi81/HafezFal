package com.example.hafezfal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hafezfal.data.PoetsResponseItem;

import java.util.List;

public class BiographyAdapter extends RecyclerView.Adapter<BiographyAdapter.ViewHolder> {

    private List<PoetsResponseItem> localDataSet;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView name;
        private final TextView birth;
        private final TextView death;
        private final ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
            birth = (TextView) view.findViewById(R.id.birth_place);
            death = (TextView) view.findViewById(R.id.death_place);
            imageView = (ImageView) view.findViewById(R.id.imageView);
        }
    }

    public BiographyAdapter(List<PoetsResponseItem> dataSet, Context context) {
        localDataSet = dataSet;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.biography_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        viewHolder.name.setText(localDataSet.get(position).getName());

        if (localDataSet.get(position).getDeathPlace().equals(""))
            viewHolder.death.setText("نامشخص");
        else
            viewHolder.death.setText(localDataSet.get(position).getDeathPlace());

        if (localDataSet.get(position).getBirthPlace().equals(""))
            viewHolder.birth.setText("نامشخص");
        else
            viewHolder.birth.setText(localDataSet.get(position).getBirthPlace());

        Glide.with(context)
                .load("https://ganjgah.ir" + localDataSet.get(position).getImageUrl())
                .into(viewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}

