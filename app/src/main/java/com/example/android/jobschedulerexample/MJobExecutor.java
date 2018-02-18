package com.example.android.jobschedulerexample;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;


/**
 * Created by c4q on 2/5/18.
 */

public class MJobExecutor extends AsyncTask<Void,Void,String> {
    private static final String TAG = "EXECUTOR";
    @SuppressLint("StaticFieldLeak")
    private Context context;//this is the executor that
    MJobExecutor(Context context){
        this.context = context;
    }

    @Override
    protected String doInBackground(Void... voids) {
        Log.d(TAG, "doInBackground: ");
        //In here the asunctask is performing backgroud

        return "Background Long Running Task Finishes....";
    }

    @Override
    protected void onPostExecute(String s) {
        Toast.makeText(context, "onPostExecute", Toast.LENGTH_SHORT).show();
        super.onPostExecute(s);
    }
}
