package com.example.android.jobschedulerexample;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by c4q on 2/6/18.
 */

public class MyNotificationService extends IntentService {

    public MyNotificationService(){
        super("MyNotificationService");

    }


    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */


    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
