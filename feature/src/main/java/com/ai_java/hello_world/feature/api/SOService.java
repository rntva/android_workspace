package com.ai_java.hello_world.feature.api;

import com.ai_java.hello_world.feature.model.SOAnswersResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SOService {
    @GET("weather?id=1835329&APPID=a18675726cc9593f3ff60aad65846c66&units=metric")
    Call<SOAnswersResponse> getWeather();
}
