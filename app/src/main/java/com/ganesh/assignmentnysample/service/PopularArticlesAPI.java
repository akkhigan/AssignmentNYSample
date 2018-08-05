package com.ganesh.assignmentnysample.service;
import com.ganesh.assignmentnysample.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * This class represents the Countries API
 */
public interface PopularArticlesAPI {
    @GET("svc/mostpopular/v2/mostviewed/all-sections/7.json?api-key=ef07d6e405ea4cc895ab627180371e47")
    Call<Data> getResults();
}
