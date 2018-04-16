package com.ai_java.hello_world.feature.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient()  // 싱글톤 - 한 번만 만들어서 계속 쓸 때
    {
        if(retrofit == null)
        {
            final String BASE_URL = "https://api.openweathermap.org/data/2.5/";
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
