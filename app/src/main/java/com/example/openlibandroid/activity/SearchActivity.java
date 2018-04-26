package com.example.openlibandroid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.openlibandroid.R;
import com.example.openlibandroid.adapter.JokeAdapter;
import com.example.openlibandroid.model.JokeList;
import com.example.openlibandroid.service.BookClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_joke);
    }

    public void startSearch(View view) {
        listView = (ListView) findViewById(R.id.pagination_list);
        TextView textView = (EditText)findViewById(R.id.editText2);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://api.chucknorris.io")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        BookClient client = retrofit.create(BookClient.class);
        Call<JokeList> call = client.jokesBySearch(textView.getText().toString());

        call.enqueue(new Callback<JokeList>() {
            @Override
            public void onResponse(Call<JokeList> call, Response<JokeList> response) {
                JokeList repos = response.body();

                listView.setAdapter(new JokeAdapter(SearchActivity.this, repos));
            }

            @Override
            public void onFailure(Call<JokeList> call, Throwable t) {
                Toast.makeText(SearchActivity.this, "error :(", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
