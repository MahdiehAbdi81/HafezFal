package com.example.hafezfal;

import com.example.hafezfal.d.FalResponse;
import com.example.hafezfal.d.bio.PoetsResponse;
import com.example.hafezfal.d.bio.PoetsResponseItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("hafez/faal")
    Call<FalResponse> getFall();

    @GET("poets")
    Call<List<PoetsResponseItem>> getBiography();
}
