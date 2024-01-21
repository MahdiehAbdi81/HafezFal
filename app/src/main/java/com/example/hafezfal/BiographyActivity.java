package com.example.hafezfal;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hafezfal.data.PoetsResponseItem;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class BiographyActivity extends AppCompatActivity {

    MaterialCardView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biography);

        view = findViewById(R.id.view);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://ganjgah.ir/api/ganjoor/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        APIService service = retrofit.create(APIService.class);
        Call<List<PoetsResponseItem>> call = service.getBiography();
        call.enqueue(new Callback<List<PoetsResponseItem>>() {
            @Override
            public void onResponse(Call<List<PoetsResponseItem>> call, Response<List<PoetsResponseItem>> response) {
                RecyclerView recyclerView = findViewById(R.id.recycler_view);
                view.setVisibility(View.VISIBLE);
                recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
                BiographyAdapter customAdapter = new BiographyAdapter(response.body(),getBaseContext());
                recyclerView.setAdapter(customAdapter);
            }

            @Override
            public void onFailure(Call<List<PoetsResponseItem>> call, Throwable t) {

            }
        });
    }
}