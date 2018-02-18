package com.example.android.jobschedulerexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by c4q on 2/6/18.
 */

public class MyAlarmReciever extends BroadcastReceiver {
    public static final int REQUEST_CODE = 12345;
    public static final String ACTION = "nyc.c4q.notificationdemo.alarm";
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intent1= new Intent(context,MyNotificationService.class);
        context.startService(intent1);

    }
}
