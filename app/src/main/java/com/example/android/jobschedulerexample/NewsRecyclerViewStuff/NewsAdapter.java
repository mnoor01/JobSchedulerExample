package com.example.android.jobschedulerexample.NewsRecyclerViewStuff;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.jobschedulerexample.ModelNewsPackage.NewsModel;
import com.example.android.jobschedulerexample.ModelNewsPackage.Response;
import com.example.android.jobschedulerexample.ModelNewsPackage.Results;
import com.example.android.jobschedulerexample.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q on 2/18/18.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {
    private Results[] responses;

    public NewsAdapter(Results[] responses) {
        this.responses = responses;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View child = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_itemview, parent, false);
        return new NewsViewHolder(child);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        holder.onBind(responses[position]);


    }

    @Override
    public int getItemCount() {
        return responses.length;
    }
}
