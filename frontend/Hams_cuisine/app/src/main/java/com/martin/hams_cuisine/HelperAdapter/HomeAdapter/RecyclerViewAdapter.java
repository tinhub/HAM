package com.martin.hams_cuisine.HelperAdapter.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.martin.hams_cuisine.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    ArrayList<RecyclerViewHelper> recyclerLocations;

    public RecyclerViewAdapter(ArrayList<RecyclerViewHelper> recyclerLocations) {
        this.recyclerLocations = recyclerLocations;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_card_design,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        RecyclerViewHelper recyclerViewHelper = recyclerLocations.get(position);

        holder.image.setImageResource(recyclerViewHelper.getImage());
        holder.title.setText(recyclerViewHelper.getTitle());
        holder.desc.setText(recyclerViewHelper.getDescription());

    }

    @Override
    public int getItemCount() {
        return recyclerLocations.size();
    }


    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title, desc;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            //Hooks
            image = itemView.findViewById(R.id.recycler_image);
            title = itemView.findViewById(R.id.recycler_title);
            desc = itemView.findViewById(R.id.recycler_description);
        }
    }
}
