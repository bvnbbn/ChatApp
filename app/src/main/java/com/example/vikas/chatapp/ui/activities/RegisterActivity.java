package com.example.vikas.chatapp.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.vikas.chatapp.R;

/**
 * Created by vikas on 19/5/17.
 */

public class RegisterActivity  extends AppCompatActivity
{

    private Toolbar mToolbar;

    public static void startActivity(Context context)
    {
        Intent intent = new Intent(context,RegisterActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        bindViews();
        init();
    }
    private void bindViews()
    {
        //toolbar


    }
    private void init()
    {
        setSupportActionBar(mToolbar);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_content_register,
                RegisterFragment.newInstance(),
                RegisterFragment.class.getSimpleName());
        fragmentTransaction.commit();
    }


}
