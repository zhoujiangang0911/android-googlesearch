package com.zhoujg77.googlesearch.dagger;

import com.zhoujg77.googlesearch.MainActivity;
import com.zhoujg77.googlesearch.search.SearchController;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zhoujiangang on 16/1/7.
 */

@Singleton
@Component(modules = {RetrofitModule.class,SearchModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
    SearchController getSearch();
}
