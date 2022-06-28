package com.example.java.Activity;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.TextView;

import com.example.java.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initViews();
    }
//    void initViews(){
//        TextView textView = findViewById(R.id.textView);
//        String text = "I know just to #whister, And I know how to dry, I know just where to find the anser";
//
//        Spannable spannable = new SpannableString(text);
//        spannable.setSpan(new ForegroundColorSpan(Color.BLUE),18,27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        textView.setText(spannable);
//    }
}