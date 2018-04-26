package com.example.openlibandroid.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.openlibandroid.R;
import com.example.openlibandroid.model.Joke;
import com.example.openlibandroid.model.JokeList;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private List<Joke> jokeList;
    public RecyclerAdapter(List<Joke> jokeList) {
        this.jokeList=jokeList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.Name.setText(jokeList.get(position).getValue());
    }

    @Override
    public int getItemCount() {
        return jokeList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView Name;
        public MyViewHolder(View itemView) {
            super(itemView);
            Name = (TextView)itemView.findViewById(R.id.joke);
        }
    }
}
