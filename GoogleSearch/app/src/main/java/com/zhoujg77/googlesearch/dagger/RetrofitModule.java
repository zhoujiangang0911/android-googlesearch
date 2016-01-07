package com.zhoujg77.googlesearch.dagger;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Converter;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by zhoujiangang on 16/1/7.
 */
@Module
public class RetrofitModule {

    @Provides
    @Singleton
    OkHttpClient provideHttpClient(){
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient httpClient = new OkHttpClient();
        httpClient.interceptors().add(loggingInterceptor);
        return httpClient;
    }

    @Provides
    @Singleton
    Converter.Factory provideConverter(){
        return GsonConverterFactory.create();
    }

    @Provides
    Retrofit.Builder  provideRectrofitBuider(OkHttpClient httpClient,Converter.Factory factory){
        return new Retrofit.Builder()
                .client(httpClient)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(factory);

    }

}
