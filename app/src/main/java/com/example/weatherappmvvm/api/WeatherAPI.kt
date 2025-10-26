package com.example.weatherappmvvm.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {

     @GET("/v1/current.json")
     suspend fun getWeather(
         @Query("key") apikey:String, //@Query("key") is in the base api
         @Query("q") city:String // @Query("q") is in the base api
     ) : Response<WeatherModel>


}