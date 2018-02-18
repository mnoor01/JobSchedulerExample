package com.example.android.jobschedulerexample.NewsRecyclerViewStuff;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.android.jobschedulerexample.ModelNewsPackage.Response;
import com.example.android.jobschedulerexample.ModelNewsPackage.Results;
import com.example.android.jobschedulerexample.R;

/**
 * Created by c4q on 2/18/18.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder {
    private TextView status;
    private TextView userTier;
    private TextView orderBy;
    public NewsViewHolder(View itemView) {
        super(itemView);
        status= itemView.findViewById(R.id.status);
        userTier= itemView.findViewById(R.id.userTier);
        orderBy=itemView.findViewById(R.id.orderby);

    }
    public void onBind(Results response){
        status.setText(response.getSectionName());
        userTier.setText(response.getWebTitle());
        orderBy.setText(response.getWebUrl());

    }
}
