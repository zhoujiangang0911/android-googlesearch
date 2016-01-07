package com.zhoujg77.googlesearch.dagger;

import com.zhoujg77.googlesearch.search.GoogleSearch;
import com.zhoujg77.googlesearch.search.GoogleSearchController;
import com.zhoujg77.googlesearch.search.SearchController;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Retrofit;

/**
 * Created by zhoujiangang on 16/1/7.
 */
@Module
public class SearchModule {

    @Provides
    @Singleton
    GoogleSearch provideGoogleSearch(Retrofit.Builder builder){
        return builder.baseUrl(GoogleSearch.BASE_URL).build().create(GoogleSearch.class);
    }

    @Provides
    SearchController provideSearchController(GoogleSearchController searchController) {
        return searchController;
    }

}
