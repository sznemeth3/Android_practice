package com.example.openlibandroid.service;

import com.example.openlibandroid.model.BookList;
import com.example.openlibandroid.model.Joke;
import com.example.openlibandroid.model.JokeList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiClient {
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("/jokes/search")
    Call<JokeList> jokesBySearch(@Query(value = "query") String search);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("/search.json")
    Call<BookList> booksBySearch(@Query(value = "author") String search);
}
