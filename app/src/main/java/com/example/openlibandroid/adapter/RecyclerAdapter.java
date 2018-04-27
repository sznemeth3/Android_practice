package com.example.openlibandroid.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.openlibandroid.R;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        if (jokeList != null) {
            holder.joke.setText(jokeList.getResult().get(position).getValue());
        } else {
            holder.book.setText(bookList.getDocs().get(position).getTitle());
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
        public MyViewHolder(View itemView) {
            super(itemView);
            joke = (TextView)itemView.findViewById(R.id.joke);
            book = (TextView)itemView.findViewById(R.id.book);
        }
    }
}
