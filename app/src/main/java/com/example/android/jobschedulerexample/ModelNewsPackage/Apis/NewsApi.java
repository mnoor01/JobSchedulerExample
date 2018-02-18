package com.example.android.jobschedulerexample.ModelNewsPackage.Apis;

import com.example.android.jobschedulerexample.ModelNewsPackage.NewsModel;
import com.example.android.jobschedulerexample.ModelNewsPackage.Response;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by c4q on 2/18/18.
 */

public interface NewsApi {
    @GET("world/france?api-key=test")
    Call<NewsModel> getNews();
}
