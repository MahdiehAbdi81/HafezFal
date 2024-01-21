package com.example.hafezfal;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hafezfal.data.FalResponse;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class FalActivity extends AppCompatActivity {

    TextView title, poem;
    MaterialCardView view;
    MaterialButton fal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fal);

        title = findViewById(R.id.title);
        poem = findViewById(R.id.poem);
        view = findViewById(R.id.view);
        fal = findViewById(R.id.fal);

        getFal();

        fal.setOnClickListener(view1 -> {
            getFal();
        });
    }

    private void getFal() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://ganjgah.ir/api/ganjoor/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        APIService service = retrofit.create(APIService.class);
        Call<FalResponse> call = service.getFall();
        call.enqueue(new Callback<FalResponse>() {
            @Override
            public void onResponse(Call<FalResponse> call, Response<FalResponse> response) {

                fal.setVisibility(View.VISIBLE);
                view.setVisibility(View.VISIBLE);
                String poemString = response.body().getPlainText();
                String[] lines = poemString.split("\n");

                StringBuilder combinedPoem = new StringBuilder();
                for (int i = 0; i < lines.length; i += 2) {
                    if (i + 1 < lines.length) {
                        combinedPoem.append(lines[i]).append("\t\t\t\t\t").append(lines[i + 1]).append("\n");
                    } else {
                        combinedPoem.append(lines[i]).append("\n");
                    }
                }

                title.setText(response.body().getTitle());
                poem.setText(combinedPoem);
            }

            @Override
            public void onFailure(Call<FalResponse> call, Throwable t) {
            }
        });
    }

}