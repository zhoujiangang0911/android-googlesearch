package com.zhoujg77.googlesearch.search;

/**
 * Created by zhoujiangang on 16/1/7.
 */
public class SearchCursor {


    public long estimatedResultCount;
    public String moreResultsUrl;
    public long currentPageIndex;
    public Page pages[];

    public static class Page {
        public String start;
        public int label;
    }

}
