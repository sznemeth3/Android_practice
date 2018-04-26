package com.example.openlibandroid.service;

import com.example.openlibandroid.model.Book;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;


public interface BookClient {
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("posts/1/comments")
    Call<List<Book>> booksForUser();
}
