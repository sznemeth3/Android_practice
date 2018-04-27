package com.example.openlibandroid.adapter;

import android.content.Intent;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.openlibandroid.R;
import com.example.openlibandroid.activity.CategoryActivity;
import com.example.openlibandroid.activity.show_element_activity;
import com.example.openlibandroid.model.BookList;
import com.example.openlibandroid.model.JokeList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private JokeList jokeList;
    private BookList bookList;
    public RecyclerAdapter(JokeList jokeList) {
        this.jokeList=jokeList;
    }

    public RecyclerAdapter(BookList bookList) {
        this.bookList=bookList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (jokeList != null) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
            return new MyViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            return new MyViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        if (jokeList != null) {
            holder.joke.setText(jokeList.getResult().get(position).getValue());
        } else {
            holder.book.setText(bookList.getDocs().get(position).getTitle());
            holder.buttonToList.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(view.getContext(), show_element_activity.class);
                    intent.putExtra("detail",bookList.getDocs().get(position).getAuthor_name().get(0));
                    view.getContext().startActivity(intent);
                }

            });
        }
    }

    @Override
    public int getItemCount() {
        if (jokeList != null) {
            return jokeList.getTotal();
        } else {
            return bookList.getNumFound();
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView book;
        TextView joke;
        Button buttonToList;
        public MyViewHolder(View itemView) {
            super(itemView);
            joke = (TextView)itemView.findViewById(R.id.joke);
            book = (TextView)itemView.findViewById(R.id.book);
            buttonToList = (Button)itemView.findViewById(R.id.button2);
        }
    }
}
