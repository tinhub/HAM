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

public class Today_S_RV_Adapter extends RecyclerView.Adapter<Today_S_RV_Adapter.RecyclerViewHolder> {

    ArrayList<RecyclerViewHelper2> recyclerLocations2;

    public Today_S_RV_Adapter(ArrayList<RecyclerViewHelper2> recyclerLocations2) {
        this.recyclerLocations2 = recyclerLocations2;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.todays_special,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        RecyclerViewHelper2 recyclerViewHelper2 = recyclerLocations2.get(position);

        holder.image.setImageResource(recyclerViewHelper2.getImage());
        holder.title.setText(recyclerViewHelper2.getTitle());
        holder.desc.setText(recyclerViewHelper2.getDescription());

    }

    @Override
    public int getItemCount() {
        return recyclerLocations2.size();
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
