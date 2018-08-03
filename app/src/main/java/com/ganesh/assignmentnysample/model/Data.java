package com.ganesh.assignmentnysample.model;

import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("APIResponse")
    private APIResponse apiResponse;

    public APIResponse getAPIResponse() {
        return apiResponse;
    }
}
