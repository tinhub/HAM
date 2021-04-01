package com.martin.hams_cuisine;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ProfileFragment extends Fragment {
    private UserViewModel userViewModel;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*userViewModel = new ViewModelProvider(new MainActivity()).get(UserViewModel.class);*/
       /* final NavController navController = Navigation.findNavController(view);
        userViewModel.user.observe(getViewLifecycleOwner(), (Observer<User>) user -> {
            if (user != null) {
                showWelcomeMessage();
            } else {
                navController.navigate(R.id.login_fragment);
            }
        });*/
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}