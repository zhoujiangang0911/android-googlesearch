package com.zhoujg77.googlesearch.search;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by zhoujiangang on 16/1/7.
 */
public interface GoogleSearch {



    String BASE_URL = "https://ajax.googleapis.com";

    @GET("/ajax/services/search/web?v=1.0")
    Observable<Response> search(@Query("q") String query);
}
