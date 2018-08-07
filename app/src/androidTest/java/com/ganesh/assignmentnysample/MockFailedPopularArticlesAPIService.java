package com.ganesh.assignmentnysample;

import com.ganesh.assignmentnysample.model.Data;
import com.ganesh.assignmentnysample.service.PopularArticlesAPI;

import retrofit2.Call;
import retrofit2.mock.BehaviorDelegate;

public class MockFailedPopularArticlesAPIService  implements PopularArticlesAPI{

    private final BehaviorDelegate<PopularArticlesAPI> delegate;

    public MockFailedPopularArticlesAPIService(BehaviorDelegate<PopularArticlesAPI> service) {
        this.delegate = service;
    }
    @Override
    public Call<Data> getResults() {
        return null;
    }
}
