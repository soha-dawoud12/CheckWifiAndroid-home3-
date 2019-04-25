package com.example.justdoit.checkwifiandroid;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.BitmapFactory;
import android.os.BatteryManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView= findViewById(R.id.txtWifi);

        ///notification

        NotificationHelper helper= new NotificationHelper(this);



        boolean isConnectedWIFI = Connection.isConnectedWifi(this);

        if (isConnectedWIFI){
            textView.setText("  Connected");
            helper.createNotification("Internet","Connected");


        }else {
            textView.setText("  Not Connected");
            helper.createNotification("Internet","Not Connected");


        }




    }
}
