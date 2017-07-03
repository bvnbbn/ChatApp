package com.example.vikas.chatapp.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.vikas.chatapp.R;

/**
 * Created by vikas on 19/5/17.
 */

public class ChatActivity extends AppCompatActivity
{
    private Toolbar mToolbar;

    public static void startActivity(Context context,
                                     String reciever,
                                     String recieverUid,
                                     String firebaseToken)
    {
        Intent intent = new Intent(context,ChatActivity.class);
        intent.putExtra(Constants.);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
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
        mToolbar.setTitle(getIntent().getExtras().getString(Constants.ARG_RECIEVER));
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_content_chat,
                ChatFragment.newInstance(getIntent().getExtras().getString(Constants.ARG_RECIVER),
                        getIntent().getExtras().getString(Constants.ARG_RECIVER_UID),
                        getIntent().getExtras().getString(Constants.ARG_RECIVER_TOKEN)),
                ChatFragment.class.getSimpleName());
        fragmentTransaction.commit();
    }


}
