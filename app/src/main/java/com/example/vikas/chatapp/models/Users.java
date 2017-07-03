package com.example.vikas.chatapp.models;

/**
 * Created by vikas on 19/5/17.
 */

public class Users
{
    private String emailId;
    private String lastMessage;
    private  int notifCount;


    public String getLastMessage()
    {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage)
    {
        this.lastMessage = lastMessage;
    }

    public int getNotifCount()
    {
        return notifCount;
    }

    public void setNotifCount(int notifCount)
    {
        this.notifCount = notifCount;
    }
}
