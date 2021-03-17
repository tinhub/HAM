package com.martin.hams_cuisine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {
    EditText email,password;
    Button loginbtn,backbtn,forgottpass;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        email = root.findViewById(R.id.username_email);
        password = root.findViewById(R.id.password);
        loginbtn = root.findViewById(R.id.loginbtn);
        backbtn = root.findViewById(R.id.backbtn);
        forgottpass = root.findViewById(R.id.forgotbtn);

        email.setTranslationX(800);
        password.setTranslationX(800);
        loginbtn.setTranslationX(800);
        backbtn.setTranslationX(800);
        forgottpass.setTranslationX(800);

        email.setAlpha(v);
        password.setAlpha(v);
        loginbtn.setAlpha(v);
        backbtn.setAlpha(v);
        forgottpass.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        loginbtn.animate().translationX(0).alpha(0).setDuration(800).setStartDelay(500).start();
        backbtn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        forgottpass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();


        return root;
    }
}
