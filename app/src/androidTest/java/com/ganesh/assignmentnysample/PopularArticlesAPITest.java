package com.ganesh.assignmentnysample;

import android.support.test.filters.SmallTest;
import android.test.InstrumentationTestCase;

import com.ganesh.assignmentnysample.model.APIResponse;
import com.ganesh.assignmentnysample.model.Data;
import com.ganesh.assignmentnysample.presenter.PopularArticlesPresenter;
import com.ganesh.assignmentnysample.service.PopularArticlesAPI;

import junit.framework.Assert;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.mock.BehaviorDelegate;
import retrofit2.mock.MockRetrofit;
import retrofit2.mock.NetworkBehavior;

public class PopularArticlesAPITest extends InstrumentationTestCase {
    private MockRetrofit mockRetrofit;
    private Retrofit retrofit;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        retrofit = new Retrofit.Builder().baseUrl("http://test.com")
                .client(new OkHttpClient())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        NetworkBehavior behavior = NetworkBehavior.create();

        mockRetrofit = new MockRetrofit.Builder(retrofit)
                .networkBehavior(behavior)
                .build();
    }

    @SmallTest
    public void testRandomResults() throws Exception {
        BehaviorDelegate<PopularArticlesAPI> delegate = mockRetrofit.create(PopularArticlesAPI.class);
        PopularArticlesAPI mockPopularArticlesService = new MockPopularArticlesAPIService(delegate);

        //Actual Test
        Call<Data> result = mockPopularArticlesService.getResults();
        Response<Data> response = result.execute();

        //Asserting response
        Assert.assertTrue(response.isSuccessful());

    }


}
