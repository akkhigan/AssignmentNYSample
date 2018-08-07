package com.ganesh.assignmentnysample;

import android.support.test.runner.AndroidJUnit4;

import com.ganesh.assignmentnysample.model.Result;
import com.ganesh.assignmentnysample.presenter.PopularArticlesPresenter;
import com.ganesh.assignmentnysample.service.PopularArticlesService;
import com.ganesh.assignmentnysample.view.PopularArticlesView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

@RunWith(AndroidJUnit4.class)
public class PopularArticlesPresenterTest {

    @Mock
    PopularArticlesView view;

    @Mock
    PopularArticlesService articlesService;

    PopularArticlesPresenter presenter;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        presenter = new PopularArticlesPresenter(view);
    }

    @Test
    public void getPopularArticles() throws Exception {
        List<Result> articleList = new ArrayList<>();
        presenter.getMostPopularArticles();
        Mockito.verify(view, Mockito.only()).popularArticlesList(articleList);
    }

}
