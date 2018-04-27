package com.example.openlibandroid.activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.openlibandroid.R;
import com.example.openlibandroid.adapter.RecyclerAdapter;
import com.example.openlibandroid.model.BookList;
import com.example.openlibandroid.service.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BookByAuthorActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layOutManager;
    private BookList bookList;
    private ApiClient bookClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_by_author);

    }

    public void startSearchBookCategory(View view){
        TextView textView = (EditText)findViewById(R.id.editText2);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layOutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layOutManager);
        recyclerView.setHasFixedSize(true);
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://openlibrary.org")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();
        bookClient = retrofit.create(ApiClient.class);
        String author = textView.getText().toString();
        Call<BookList> call = bookClient.booksBySearch(author);
        call.enqueue(new Callback<BookList>() {
            @Override
            public void onResponse(Call<BookList> call, Response<BookList> response) {
                bookList = response.body();
                recyclerView.setAdapter(new RecyclerAdapter(bookList));
            }

            @Override
            public void onFailure(Call<BookList> call, Throwable t) {
                System.out.println("----------------------------------------------------------------------");
                t.printStackTrace();
                Toast.makeText(BookByAuthorActivity.this, "error :(", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
