package com.example.java;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.java.model.Member;
import com.example.java.model.Users;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    static final String TAG = MainActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
       // backFinish();
    }
    void initViews(){ // Jonatish 1da 2ga
        Button button_open = findViewById(R.id.button_open);
        button_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Users users = new Users(25,"Abbosbek");
                openSecondActivity(users);
            }
        });
    }
    void openSecondActivity(Users users){//1dan 2ni ochish
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("users", users);
        startActivity(intent);
    }


    void backFinish(){//Qabul qilish 2 da 1ga
        TextView tv_home = findViewById(R.id.tv_home);

        Member member = (Member) getIntent().getSerializableExtra("member");
        Log.d(TAG,member.toString());

        tv_home.setText(member.toString());
    }
}