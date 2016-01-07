package com.zhoujg77.googlesearch.search;

/**
 * Created by zhoujiangang on 16/1/7.
 */
public class SearchException extends Exception{
    public SearchException() {
    }

    public SearchException(String detailMessage) {
        super(detailMessage);
    }

    public SearchException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public SearchException(Throwable throwable) {
        super(throwable);
    }
}
