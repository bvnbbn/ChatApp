package com.example.vikas.chatapp.ui.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.vikas.chatapp.R;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by vikas on 19/5/17.
 */

public class SplashActivity extends AppCompatActivity
{

    private static final int SPLASH_TIME=2000;
    private Handler mhandler;
    private Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mhandler = new Handler();
        mRunnable=new Runnable() {
            @Override
            public void run() {
                if(FirebaseAuth.getInstance().getCurrentUser()!=null)
                {
                    UserListingActivity.startActivity(SplashActivity.this);
                }
                else
                {
                    LoginActivity.startActivity(SplashActivity.this);
                }
                finish();
            }
        }

    }


}
