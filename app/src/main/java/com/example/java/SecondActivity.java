package com.example.java;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.java.model.Member;
import com.example.java.model.Users;

import java.lang.reflect.Method;

public class SecondActivity extends AppCompatActivity {
    static final String TAG = SecondActivity.class.toString();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
        backFinish();
    }

    void backFinish(){ // Jonatish 2da 1ga
        Button b_exit = findViewById(R.id.b_exit);
        b_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Member member = new Member(1,"Raxmat!");
                openMainActivity(member);
                finish();
            }
        });
    }
    void openMainActivity(Member member){//1dan 2ni ochish
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("member", member);

        startActivity(intent);
    }


    void initViews(){//Qabul qilish 1 da 2ga
        TextView text_id = findViewById(R.id.text_id);

        Users users = (Users) getIntent().getSerializableExtra("users");
        Log.d(TAG,users.toString());

        text_id.setText(users.toString());
    }
}