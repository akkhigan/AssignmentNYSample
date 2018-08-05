package com.ganesh.assignmentnysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ganesh.assignmentnysample.model.Result;
import com.ganesh.assignmentnysample.presenter.PopularArticlesPresenter;
import com.ganesh.assignmentnysample.view.PopularArticlesView;
import com.ganesh.assignmentnysample.view.adapters.ArticlesAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements PopularArticlesView{
    RecyclerView recyclerView;
    ArticlesAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PopularArticlesPresenter presenter  =  new PopularArticlesPresenter(this);
        presenter.getMostPopularArticles();

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    @Override
    public void popularArticlesList(List<Result> articles) {

        mAdapter = new ArticlesAdapter(this,articles);
        recyclerView.setAdapter(mAdapter);

    }
}
