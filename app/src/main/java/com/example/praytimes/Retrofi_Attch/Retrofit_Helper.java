package com.example.praytimes.Retrofi_Attch;

import com.example.praytimes.Model_for_api.Muslim_Salat;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Retrofit_Helper {
    @GET("egy/weekly.json")
    public Call<Muslim_Salat> gettimsalate(@Query(Api_identifier.API_key) String api_key);
}
