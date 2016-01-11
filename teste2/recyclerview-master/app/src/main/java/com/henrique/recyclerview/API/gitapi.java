package com.henrique.recyclerview.API;

import com.henrique.recyclerview.models.ListGit;
import com.henrique.recyclerview.models.gitmodel;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface gitapi {
    @GET("/api/users")
    Call<ListGit> getUser(@Query("page") int page);
}