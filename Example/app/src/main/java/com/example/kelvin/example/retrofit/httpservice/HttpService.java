package com.example.kelvin.example.retrofit.httpservice;


import com.example.kelvin.example.retrofit.news.NewsEntitiy;
import com.example.kelvin.example.retrofit.weather.WeatherEntuty;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by kelvin on 2017/5/8.
 */

public interface HttpService {


    @GET("weather/index")
    Observable<WeatherEntuty> getWeather(@Query("cityname") String cityname,
                                         @Query("dtype") String dtype,
                                         @Query("key") String key,
                                         @Query("format") int format);

    @POST("toutiao/index")
    Observable<NewsEntitiy> getNew(@Query("type") String type,
                                   @Query("key") String key);


    @POST("toutiao/index")
    Observable<String> getNewStringString(@Query("type") String type,
                             @Query("key") String key);




}
