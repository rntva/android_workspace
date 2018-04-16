package com.ai_java.hello_world.feature.api;

public class ApiUtils {
    public static SOService getSOService()
    {
        return RetrofitClient.getClient().create(SOService.class);
    }
}
