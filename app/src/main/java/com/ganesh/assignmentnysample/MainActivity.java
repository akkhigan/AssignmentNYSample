package com.ganesh.assignmentnysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ganesh.assignmentnysample.model.PopularArticles;
import com.ganesh.assignmentnysample.presenter.PopularArticlesPresenter;
import com.ganesh.assignmentnysample.view.PopularArticlesView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements PopularArticlesView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PopularArticlesPresenter presenter  =  new PopularArticlesPresenter(this);
        presenter.getMostPopularArticles();
    }

    @Override
    public void popularArticlesList(List<PopularArticles> articles) {


    }
}
