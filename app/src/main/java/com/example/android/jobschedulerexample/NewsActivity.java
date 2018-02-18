package com.example.android.jobschedulerexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import com.example.android.jobschedulerexample.ModelNewsPackage.Response;

import com.example.android.jobschedulerexample.ModelNewsPackage.Apis.NewsApi;
import com.example.android.jobschedulerexample.ModelNewsPackage.NewsModel;
import com.example.android.jobschedulerexample.ModelNewsPackage.Results;
import com.example.android.jobschedulerexample.NewsRecyclerViewStuff.NewsAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsActivity extends AppCompatActivity {
    private TextView vulgar;
    private NewsModel modelNews;
    private Response responseModel;
    private Results[] responseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        Intent intent= getIntent();
        setRetro();
        Log.d("nice", "onCreate:hiwch ");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.create_new:
                break;
            case R.id.open:
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);
    }



    public void setRetro() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://content.guardianapis.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final NewsApi getStuff = retrofit.create(NewsApi.class);
        Call<NewsModel> getWho = getStuff.getNews();
        getWho.enqueue(new Callback<NewsModel>() {
            @Override
            public void onResponse(Call<NewsModel> call, retrofit2.Response<NewsModel> response) {
                modelNews=response.body();
                Log.d("mainactivity", "onResponse: "+ modelNews.getResponse().getUserTier());
                recyclerviewStuff();
                Log.d("who", "onResponse: "+ responseList[0].getApiUrl());

            }

            @Override
            public void onFailure(Call<NewsModel> call, Throwable t) {
                t.printStackTrace();

            }
        });

    }
    public void recyclerviewStuff(){
        RecyclerView recyclerView= findViewById(R.id.newRecyclerView);

        NewsAdapter adapter= new NewsAdapter(responseList);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);



    }


}
