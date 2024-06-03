package com.plcoding.weatherapp.domain.repository

import com.plcoding.weatherapp.domain.util.Resource
import com.plcoding.weatherapp.domain.weather.model.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(
        latitude: Double,
        longitude: Double
    ): Resource<WeatherInfo>
}
