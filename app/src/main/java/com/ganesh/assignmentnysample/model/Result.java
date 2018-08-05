package com.ganesh.assignmentnysample.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Result {

    @SerializedName("url")
    private String url;

    public String getUrl() { return this.url; }

    @SerializedName("adx_keywords")
    private String adx_keywords;

    public String getAdxKeywords() { return this.adx_keywords; }

    @SerializedName("column")
    private String column;

    public String getColumn() { return this.column; }

    @SerializedName("section")
    private String section;

    public String getSection() { return this.section; }

    @SerializedName("byline")
    private String byline;

    public String getByline() { return this.byline; }

    @SerializedName("type")
    private String type;

    public String getType() { return this.type; }

    @SerializedName("title")
    private String title;

    public String getTitle() { return this.title; }

//
//    @SerializedName("abstract")
//    private String abstract;
//
//    public String getAbstract() { return this.abstract; }

    @SerializedName("published_date")
    private String published_date;

    public String getPublished_date(){ return this.published_date; }


}
