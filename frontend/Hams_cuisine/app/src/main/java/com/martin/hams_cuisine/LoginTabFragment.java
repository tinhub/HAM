package com.martin.hams_cuisine;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.martin.hams_cuisine.R.id.user_name;
import static com.martin.hams_cuisine.R.id.username_email;

public class LoginTabFragment extends Fragment {
    private EditText username;
    private EditText password;
    private Button loginbtn;
    private Button backbtn;
    private Button forgotbtn;
    EditText email;
    Button forgottpass;
    View userName;
    View pass;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    CallbackFragment callbackFragment;
    //EditText email,password;
    //Button loginbtn,backbtn,forgottpass;
    float v = 0;

    private final String Username = "Admin";
    private final String Password = "123456789";
    private LayoutInflater inflater;
    @Nullable
    private ViewGroup container;
    @Nullable
    private Bundle savedInstanceState;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        /*loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = username.getText().toString();
                String inputPassword = password.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {

                    Toast.makeText(getActivity(),
                            "Please enter all the details correctly!",
                            Toast.LENGTH_SHORT).show();
                } else if (inputName.equals(username) || inputPassword.equals(password))
                {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                }

            }
        });*/



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
        loginbtn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        backbtn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgottpass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });



        return root;
       //loginbtn();

    }

   /* @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void loginbtn() {
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = username.getText().toString();
                String inputPassword = password.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {

                    Toast.makeText(getActivity(),
                            "Please enter all the details correctly!",
                            Toast.LENGTH_SHORT).show();
                } else if (inputName.equals(username) || inputPassword.equals(password))
                {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                }

            }
        });


    }*/
   @Override
   public void onAttach(Context context) {
       sharedPreferences = context.getSharedPreferences("usersFile", Context.MODE_PRIVATE);
       editor = sharedPreferences.edit();
       super.onAttach(context);
   }

   /* @Nullable
    @Override
    public View onCreateView() {
        return onCreateView(, , );
    }*/

  /*  @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_tab_fragment, container, false);
        userName = view.findViewById(username_email);
        pass = view.findViewById(R.id.password);
        loginbtn = view.findViewById(R.id.loginbtn);
        backbtn = view.findViewById(R.id.backbtn);


        /*  btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName = username_email.getText().toString();
                pass = password.getText().toString();
                String uName, uPass;
                uName = sharedPreferences.getString("userName", "null");
                uPass = sharedPreferences.getString("pass", "null");

                if (userName.equals(uName) && pass.equals(uPass)) {
                    Toast.makeText(getContext(), "Login", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
           /* loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = username.getText().toString();
                String inputPassword = password.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {

                    Toast.makeText(getActivity(),
                            "Please enter all the details correctly!",
                            Toast.LENGTH_SHORT).show();
                } else if (inputName.equals(username) || inputPassword.equals(password))
                {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                }

            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (callbackFragment != null) {
                    callbackFragment.changeFragment();
                }
            }
        });
        return view;
    }*/

    public void setCallbackFragment(CallbackFragment callbackFragment) {
        this.callbackFragment = callbackFragment;
    }

    /*public void setCallbackFragment(CallbackFragment callbackFragment) {
        this.callbackFragment = callbackFragment;
    }*/

}
