package com.zhoujg77.googlesearch.search;

import android.support.annotation.MainThread;

/**
 * Created by zhoujiangang on 16/1/7.
 */
public interface SearchController {

    interface  Listener{
        @MainThread void onSearchStarted(String query);
        @MainThread void onSearchResults(SearchResult ... results);
        @MainThread void onSearchError(Throwable throwable);
    }



    void  setListener(Listener listener);
    void  search(String query);
    void  cancel();

}
