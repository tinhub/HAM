package com.martin.hams_cuisine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {
    EditText username,email,password,confirmpass;
    Button signupbtn;
    View phonenumber;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);

        username = root.findViewById(R.id.user_name);
        email = root.findViewById(R.id.username_email);
        phonenumber = root.findViewById(R.id.phone_number);
        password = root.findViewById(R.id.password);
        confirmpass = root.findViewById(R.id.confirm_password);
        signupbtn = root.findViewById(R.id.signup_btn);

        username.setTranslationX(800);
        email.setTranslationX(800);
        phonenumber.setTranslationX(800);
        password.setTranslationX(800);
        confirmpass.setTranslationX(800);
        signupbtn.setTranslationX(800);

        username.setAlpha(v);
        email.setAlpha(v);
        phonenumber.setAlpha(v);
        password.setAlpha(v);
        confirmpass.setAlpha(v);
        signupbtn.setAlpha(v);

        username.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        phonenumber.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        confirmpass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        signupbtn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();


        return root;
    }


}
