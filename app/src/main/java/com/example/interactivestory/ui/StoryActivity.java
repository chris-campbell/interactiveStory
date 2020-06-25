package com.example.interactivestory.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.interactivestory.R;
import com.example.interactivestory.model.Page;

public class StoryActivity extends AppCompatActivity {
    public static final String TAG = StoryActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String key = getResources().getString(R.string.key_name);
        String name = intent.getStringExtra(key);
        if (name == null || name.equals("")) {
            name = "Friend";
        }
        Log.d(TAG, name);

    }
}