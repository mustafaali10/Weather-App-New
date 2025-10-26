package com.example.weatherappmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherappmvvm.api.Constant
import com.example.weatherappmvvm.api.NetworkResponse
import com.example.weatherappmvvm.api.RetrofitInstance
import com.example.weatherappmvvm.api.WeatherModel
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel(){

    private val weatherAPI = RetrofitInstance.weatherApi

    private val _weatherResult = MutableLiveData<NetworkResponse<WeatherModel>>()
    val weatherResult : LiveData<NetworkResponse<WeatherModel>> = _weatherResult

    fun getData(city:String){

        _weatherResult.value = NetworkResponse.Loading

        viewModelScope.launch {
            try {
                val response = weatherAPI.getWeather(Constant.apiKey,city)
                if(response.isSuccessful) {
                    response.body()?.let {
                        _weatherResult.value = NetworkResponse.Success(it)
                    }
                }
                else{
                    _weatherResult.value = NetworkResponse.Error("Failed to Load Data")
                }
            }
            catch (e: Exception){
                _weatherResult.value = NetworkResponse.Error("Failed to Load Data in Catch")
            }

        }

    }
}