package com.example.openlibandroid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.openlibandroid.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSubjectActivity(View view) {
        Intent intent = new Intent(this, SubjectActivity.class);
        startActivity(intent);
    }

    public void openAuthorActivity(View view) {
        Intent intent = new Intent(this, AuthorActivity.class);
        startActivity(intent);
    }

    public void openBookActivity(View view) {
        Intent intent = new Intent(this, BookActivity.class);
        startActivity(intent);
    }
}
