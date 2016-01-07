package com.zhoujg77.googlesearch.search;

/**
 * Created by zhoujiangang on 16/1/7.
 */
public class Response {

    public int responseStatus;
    public String responseDetails;
    public Data responseData;

    public static class Data {
        public SearchResult results[];
        public SearchCursor cursor;
    }


}
