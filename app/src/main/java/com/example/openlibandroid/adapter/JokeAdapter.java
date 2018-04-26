package com.example.openlibandroid.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.openlibandroid.R;
import com.example.openlibandroid.model.Joke;
import com.example.openlibandroid.model.JokeList;

import java.util.List;



/**
 * Created by norman on 12/26/16.
 */

public class JokeAdapter extends ArrayAdapter<Joke> {

    private Context context;
    private JokeList values;

    public JokeAdapter(Context context, JokeList values) {
        super(context, R.layout.list_item_pagination, values.getResult());

        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_item_pagination, parent, false);
        }

        TextView textView = (TextView) row.findViewById(R.id.list_item_pagination_text);

        Joke item = values.getResult().get(position);
        String message = item.getValue();
        textView.setText(message);

        return row;
    }
}