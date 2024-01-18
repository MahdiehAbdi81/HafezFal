package com.example.hafezfal;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hafezfal.d.FalResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class FalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fal);

        TextView title = findViewById(R.id.title);
        TextView poem = findViewById(R.id.poem);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://ganjgah.ir/api/ganjoor/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        APIService service = retrofit.create(APIService.class);
        Call<FalResponse> call = service.getFall();
        call.enqueue(new Callback<FalResponse>() {
            @Override
            public void onResponse(Call<FalResponse> call, Response<FalResponse> response) {
                title.setText(response.body().getTitle());
                poem.setText(response.body().getPlainText());
            }

            @Override
            public void onFailure(Call<FalResponse> call, Throwable t) {
            }
        });
    }
}