package com.henrique.recyclerview.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by user on 1/11/16.
 */
public class ListGit {

    @SerializedName("page") String page;
    @SerializedName("per_page") Integer per_page;
    @SerializedName("total") Integer total;
    @SerializedName("total_pages") Integer total_pages;
    @SerializedName("data")List<gitmodel> listGit;

    public Integer getPerPage() {return per_page;}
    public List<gitmodel> getListUsers() {
        return listGit;
    }


}
