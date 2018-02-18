package com.example.android.jobschedulerexample;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

/**
 * Created by c4q on 2/6/18.
 */

public class BootBroadcastReciever extends WakefulBroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent startServiceIntent=new Intent(context,MyNotificationService.class);
        startWakefulService(context,startServiceIntent);
    }
}
