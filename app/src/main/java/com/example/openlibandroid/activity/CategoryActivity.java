package com.example.openlibandroid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.openlibandroid.R;
import com.example.openlibandroid.adapter.RecyclerAdapter;
import com.example.openlibandroid.model.JokeList;
import com.example.openlibandroid.service.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CategoryActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private RecyclerView.LayoutManager layOutManager;
private JokeList jokeList;
private ApiClient bookClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Spinner dropdown = (Spinner)findViewById(R.id.spinner);
        String[] items = new String[]{"explicit","dev","movie","food","celebrity","science","sport","political","religion","animal","history","music","travel","career","money","fashion"};
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

    }
    public void startSearchCategory(View view){
        Spinner dropdown = (Spinner)findViewById(R.id.spinner);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layOutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layOutManager);
        recyclerView.setHasFixedSize(true);
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://api.chucknorris.io")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();
        bookClient = retrofit.create(ApiClient.class);
        String category = dropdown.getSelectedItem().toString();
        Call<JokeList> call = bookClient.jokesBySearch(category);
        call.enqueue(new Callback<JokeList>() {
            @Override
            public void onResponse(Call<JokeList> call, Response<JokeList> response) {
                jokeList = response.body();
                recyclerView.setAdapter(new RecyclerAdapter(jokeList));
            }

            @Override
            public void onFailure(Call<JokeList> call, Throwable t) {
                System.out.println("----------------------------------------------------------------------");
                t.printStackTrace();
                Toast.makeText(CategoryActivity.this, "error :(", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
