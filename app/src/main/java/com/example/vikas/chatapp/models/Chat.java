package com.example.vikas.chatapp.models;

/**
 * Created by vikas on 19/5/17.
 */

public class Chat
{

    public String sender;
    public String reciever;
    public String senderUid;
    public String recieverUid;
    public String message;
    public long timestamp;


    public Chat()
    {

    }


    public Chat(String sender,String reciever,String senderUid,String recievrUid,String message,long timesatamp)
    {
        this.sender=sender;
        this.reciever=reciever;
        this.senderUid=sender;
        this.recieverUid=recievrUid;
        this.message=message;
        this.timestamp=timesatamp;
    }
}
