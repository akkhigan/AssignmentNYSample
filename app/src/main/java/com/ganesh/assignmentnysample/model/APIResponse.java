package com.ganesh.assignmentnysample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class APIResponse {

    @SerializedName("messages")
    private List<String> messages;

    @SerializedName("result")
    private List<PopularArticles> result;

    public List<PopularArticles> getResult() {
        return result;
    }

    public List<String> getMessages() {
        return messages;
    }

}
