package com.example.weatherappmvvm.api

sealed class NetworkResponse<out T>{
    //T refers to WeatherModel
    data class Success<out T>(val data:T): NetworkResponse<T>()
    data class Error(val message:String): NetworkResponse<Nothing>()
    object Loading: NetworkResponse<Nothing>()
}