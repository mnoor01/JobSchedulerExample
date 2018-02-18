package com.example.android.jobschedulerexample;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.android.jobschedulerexample.util.ResultActivity;

public class MainActivity extends AppCompatActivity {
    private static final int JOB_ID = 101;
    private JobScheduler jobScheduler;
    private JobInfo jobInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





/* Register the receiver at runtime.
The intent filter is the action our broadcast receiver
in our app is listening for.
When a headset is plugged in, our StartServiceReceiver will execute its onReceive method which calls JobUtil.scheduleJob() which then schedules the Job we asked to be scheduled */

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void scheduleJob(View view) {
//        ComponentName componentName = new ComponentName(this, TestJobService.class);
//        JobInfo.Builder builder = new JobInfo.Builder(JOB_ID, componentName);
//
//
//        builder.setOverrideDeadline(3000);
////        builder.setRequiredNetworkType(jobInfo.NETWORK_TYPE_ANY);
//        builder.setPersisted(true);
        registerReceiver(new StartServiceReceiver(), new IntentFilter(Intent.ACTION_BATTERY_LOW));
//
//        jobInfo = builder.build();
//        jobScheduler=(JobScheduler) getSystemService(JobScheduler.class);
//        jobScheduler.schedule(jobInfo);
        Toast.makeText(this,"Job schedule....",Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this,ResultActivity.class);
        startActivity(intent);

    }

    public void clearJob(View view) {
        jobScheduler.cancel(JOB_ID);
        Toast.makeText(this,"Job cancel.....",Toast.LENGTH_SHORT).show();

    }
    public void news(View view){
        Intent intent= new Intent(this,NewsActivity.class);
        startActivity(intent);
    }

}
