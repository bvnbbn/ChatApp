package com.example.vikas.chatapp.models;

/**
 * Created by vikas on 19/5/17.
 */

public class User
{
    public String uid;
    public String email;
    public String firebaseToken;

    public User()
    {

    }

    public User(String uid,String email,String firebaseToken)
    {
        this.uid=uid;
        this.email=email;
        this.firebaseToken=firebaseToken;
    }


}
