package com.martin.hams_cuisine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.telecom.Call;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
/*import com.martin.hams_cuisine.model.FoodData;*/
/*import com.martin.hams_cuisine.retrofit.ApiInterface;*/
import com.martin.hams_cuisine.HelperAdapter.HomeAdapter.RecyclerViewAdapter;
import com.martin.hams_cuisine.HelperAdapter.HomeAdapter.RecyclerViewHelper;
import com.martin.hams_cuisine.retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
   /* ApiInterface apiInterface;*/
    private Button button;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);



        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.tool_bar);

        //setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.nav_home);

        //Hooks
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView();
    }

    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.nav_home:
                break;
            case R.id.nav_login:
                //Intent intent =  new Intent(MainActivity.this,LoginTabFragment.class);
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.drawer_layout,new LoginTabFragment()).commit();
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void recyclerView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<RecyclerViewHelper> recyclerLocations = new ArrayList<>();
        recyclerLocations.add(new RecyclerViewHelper(R.drawable.food_barbeque, "Meat Barbeque", "KSH 500 /="));
        recyclerLocations.add(new RecyclerViewHelper(R.drawable.food_sausage, "Sausage", "@ KSH 100 /="));
        recyclerLocations.add(new RecyclerViewHelper(R.drawable.food_bolognese_sauce_pasta_salad_italian_cuisine_spaghetti, "Italian cuisine spaghetti", "KSH 300 /="));
        recyclerLocations.add(new RecyclerViewHelper(R.drawable.food_fish_fry, "Fish Fry", "KSH 600 /="));
        recyclerLocations.add(new RecyclerViewHelper(R.drawable.food_roast_chicken_barbecue_chicken, "Chicken Barbecue", "KSH 1600 /="));

        recyclerLocations.add(new RecyclerViewHelper(R.drawable.food_rye_bread_mantou, "Rye Bread Fry", "@ KSH 50 /="));
        recyclerLocations.add(new RecyclerViewHelper(R.drawable.food_bun_hamburger, "Bun Hamburger", "@ KSH 60 /="));


        adapter = new RecyclerViewAdapter(recyclerLocations);
        recyclerView.setAdapter(adapter);
    }
}