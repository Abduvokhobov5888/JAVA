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

import java.net.DatagramPacket;

public class MainActivity extends AppCompatActivity {
    static final String TAG = MainActivity.class.toString();
    int LAUNCH_DETAIL = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // initViews();
    }
    TextView tv_home;

    ActivityResultLauncher<Intent> detailLauner = registerForActivityResult(
        new ActivityResultContracts.StartActivityForResult(),
        new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == Activity.RESULT_OK){
                    Intent data = result.getData();
                    Member member = (Member) data.getSerializableExtra("member");
                    Log.d(TAG,member.toString());
                    tv_home.setText(member.toString());
                }
            }
        }
);

//    void initViews(){ // Jonatish 1da 2ga
//        tv_home = findViewById(R.id.tv_home);
//        Button button_open = findViewById(R.id.button_open);
//        button_open.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Users users = new Users(25,"Abbosbek");
//                openSecondActivity(users);
//            }
//        });
//    }
    void openSecondActivity(Users users){//1dan 2ni ochish
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("users", users);

       detailLauner.launch(intent);
    }

}