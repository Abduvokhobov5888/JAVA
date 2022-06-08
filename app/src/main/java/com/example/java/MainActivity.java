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
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.java.model.Users;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    static final String TAG = MainActivity.class.toString();
   // int LAUNCH_DETAIL = 1001;
    TextView tv_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    ActivityResultLauncher<Intent> detailLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                        String text = data.getStringExtra("result");
                        Log.d(TAG, text);
                        tv_home.setText(text);
                    }
                }
            }
    );

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Activity.RESULT_OK){
            String result = data.getStringExtra("result");
            Log.d(TAG,result);
            tv_home.setText(result);
        }
    }

    void initViews(){
        tv_home = findViewById(R.id.tv_home);
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
        detailLauncher.launch(intent);
        //startActivity(intent);
    }
}