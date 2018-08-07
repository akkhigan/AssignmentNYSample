package com.ganesh.assignmentnysample;

import com.ganesh.assignmentnysample.model.APIResponse;
import com.ganesh.assignmentnysample.model.Data;
import com.ganesh.assignmentnysample.model.Result;
import com.ganesh.assignmentnysample.service.PopularArticlesAPI;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.mock.BehaviorDelegate;

public class MockPopularArticlesAPIService implements PopularArticlesAPI {

    private final BehaviorDelegate<PopularArticlesAPI> delegate;

    public MockPopularArticlesAPIService(BehaviorDelegate<PopularArticlesAPI> service) {
        this.delegate = service;
    }

    @Override
    public Call<Data> getResults() {

        Data data  = new Data();
        APIResponse apiResponse = new APIResponse();
        Result res = new Result();
        ArrayList<Result> results = new ArrayList<>();
        results.add(res);
        return delegate.returningResponse(apiResponse).getResults();
    }
}
