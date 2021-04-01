package com.martin.hams_cuisine;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.martin.hams_cuisine.HelperAdapter.HomeAdapter.RecyclerViewAdapter;
import com.martin.hams_cuisine.HelperAdapter.HomeAdapter.RecyclerViewHelper;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Hooks
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView();
    }

    private void recyclerView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<RecyclerViewHelper> recyclerLocations = new ArrayList<>();
        recyclerLocations.add(new RecyclerViewHelper(R.drawable.food_barbeque, "recycler_title", "KSH 200 /="));
        recyclerLocations.add(new RecyclerViewHelper(R.drawable.food_bolognese_sauce_pasta_salad_italian_cuisine_spaghetti, "recycler_title", "KSH 200 /="));
        recyclerLocations.add(new RecyclerViewHelper(R.drawable.food_fish_fry, "recycler_title", "KSH 200 /="));

        adapter = new RecyclerViewAdapter(recyclerLocations);
        recyclerView.setAdapter(adapter);
    }
}
