package com.example.android.jobschedulerexample;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

import com.example.android.jobschedulerexample.util.JobUtil;

/**
 * This is our JobService implementation that will be started by our StartServiceReceiver.
 */

@RequiresApi(api = Build.VERSION_CODES.M)
public class TestJobService extends JobService {
    private MJobExecutor mJobExecutor;


    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        mJobExecutor= new MJobExecutor(getApplicationContext());
        //Show a Toast when the headset is plugged in our out

        Toast.makeText(getApplicationContext(), " Battery Low!", Toast.LENGTH_SHORT).show();
       mJobExecutor.execute();
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        //reschedule the job after it's been executed if we want this to be a reocurring action.
        mJobExecutor.cancel(true);
        JobUtil.scheduleJob(getApplicationContext());
        return true;
    }
}
