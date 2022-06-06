package com.example.java;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.java.model.Users;

public class SecondActivity extends AppCompatActivity {
    static final String TAG = SecondActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
    }
    void initViews(){
        TextView text_id = findViewById(R.id.text_id);
        Users user =(Users) getIntent().getSerializableExtra("user");
        Log.d(TAG,user.toString());
        text_id.setText(user.toString());
    }
}