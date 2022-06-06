package com.example.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.java.model.Users;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        Button button_open = (Button) findViewById(R.id.button_open);
        button_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Users user = new Users(25,"Abbosbek");
                openSecond(user);
            }
        });
    }
    void openSecond(Users user){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }
}