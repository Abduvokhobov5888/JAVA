package com.example.java;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.java.model.Member;
import com.example.java.model.Users;

public class SecondActivity extends AppCompatActivity {
    static final String TAG = SecondActivity.class.toString();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
        backToFinish();
    }
    void initViews(){
        TextView text_id = findViewById(R.id.text_id);
        Button b_exit = findViewById(R.id.b_exit);
        b_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Member member = new Member(11,"Raxmat!")
                backToFinish();
            }
        });
        Users user =(Users) getIntent().getSerializableExtra("user");
        Log.d(TAG,user.toString());
        text_id.setText(user.toString());
    }

    void backToFinish(Member member){
        Intent returnIntent = new Intent();
        returnIntent.putExtra("member",member);
        finish();
    }

    void openMainActivity(Member member){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("member", member);
        //detailLauncher.launch(intent);
        startActivity(intent);
    }
}