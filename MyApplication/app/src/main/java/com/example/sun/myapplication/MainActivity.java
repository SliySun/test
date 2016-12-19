package com.example.sun.myapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test(View view){
        Notification.Builder builder= new Notification.Builder(this);
        builder.setSmallIcon(R.mipmap.ic_launcher).setContentTitle("my notification").setContentText("test");
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.music));
        NotificationManager manager= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0,builder.build());
    }
}
