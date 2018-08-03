package com.ganesh.assignmentnysample.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PopularArticlesService {

    private Retrofit retrofit = null;


    /**
     * This method creates a new instance of the API interface.
     *
     * @return The API interface
     */
    public PopularArticlesAPI getAPI() {
        String BASE_URL = "http://api.nytimes.com/";

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(PopularArticlesAPI.class);
    }
}
