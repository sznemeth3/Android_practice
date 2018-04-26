package com.example.openlibandroid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.openlibandroid.R;
import com.example.openlibandroid.adapter.BookAdapter;
import com.example.openlibandroid.model.Book;
import com.example.openlibandroid.service.BookClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BookActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        listView = (ListView) findViewById(R.id.pagination_list);


        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        BookClient client = retrofit.create(BookClient.class);
        Call<List<Book>> call = client.booksForUser();

        call.enqueue(new Callback<List<Book>>() {
            @Override
            public void onResponse(Call<List<Book>> call, Response<List<Book>> response) {
                List<Book> repos = response.body();

                listView.setAdapter(new BookAdapter(BookActivity.this, repos));
            }

            @Override
            public void onFailure(Call<List<Book>> call, Throwable t) {
                Toast.makeText(BookActivity.this, "error :(", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
