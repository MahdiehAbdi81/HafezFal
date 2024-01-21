package com.example.hafezfal;

import com.example.hafezfal.data.FalResponse;
import com.example.hafezfal.data.PoetsResponseItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("hafez/faal")
    Call<FalResponse> getFall();

    @GET("poets")
    Call<List<PoetsResponseItem>> getBiography();
}
