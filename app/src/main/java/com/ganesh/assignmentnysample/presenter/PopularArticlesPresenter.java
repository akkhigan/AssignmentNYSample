package com.ganesh.assignmentnysample.presenter;


import com.ganesh.assignmentnysample.model.Data;
import com.ganesh.assignmentnysample.model.Result;
import com.ganesh.assignmentnysample.service.PopularArticlesService;
import com.ganesh.assignmentnysample.view.PopularArticlesView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * This class represents the PopularArticles presenter
 *
 */
public class PopularArticlesPresenter {

    private PopularArticlesView articlesView;
    private PopularArticlesService articlesService;

    public PopularArticlesPresenter(PopularArticlesView view) {
        this.articlesView = view;

        if (this.articlesService == null) {
            this.articlesService = new PopularArticlesService();
        }
    }

    public void getMostPopularArticles() {
        articlesService
                .getAPI()
                .getResults()
                .enqueue(new Callback<Data>() {
                    @Override
                    public void onResponse(Call<Data> call, Response<Data> response) {
                        Data data = response.body();

                        if (data != null && data.getAPIResponse() != null) {
                            List<Result> result = data.getAPIResponse().getResult();
                            articlesView.popularArticlesList(result);
                        }
                    }

                    @Override
                    public void onFailure(Call<Data> call, Throwable t) {
                        try {
                            throw new InterruptedException("Something went wrong!");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
}
