package com.example.openlibandroid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.openlibandroid.R;

public class show_element_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_element_activity);
        TextView textview = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        textview.setText((String)bd.get("detail"));

    }
}
