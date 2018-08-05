package com.ganesh.assignmentnysample.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class APIResponse {

    @SerializedName("status")
    private String status;

    public String getStatus() {
        return status;
    }

    @SerializedName("copyright")
    private String copyright;

    public String getCopyright() { return this.copyright; }

    @SerializedName("num_results")
    private int num_results;

    public int getNumResults() { return this.num_results; }

    @SerializedName("results")
    private List<Result> result;

    public List<Result> getResult() {
        return result;
    }

}
