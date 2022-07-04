package com.example.java.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.java.Adapter.Adapter;
import com.example.java.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView dataList;
    NestedScrollView nestedScrollview;
    List<String> titles;
    List<Integer> images;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataList = findViewById(R.id.recyclerView);
        nestedScrollview = findViewById(R.id.nestedScrollview);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("One");
        titles.add("Two");
        titles.add("Three");
        titles.add("Four");
        titles.add("Five");
        titles.add("Six");
        titles.add("Seven");
        titles.add("Eight");
        titles.add("Nine");
        titles.add("Ten");

        images.add(R.drawable.one);
        images.add(R.drawable.two);
        images.add(R.drawable.three);
        images.add(R.drawable.four);
        images.add(R.drawable.five);
        images.add(R.drawable.six);
        images.add(R.drawable.seven);
        images.add(R.drawable.eight);
        images.add(R.drawable.nine);
        images.add(R.drawable.ten);


        Adapter adapter = new Adapter(this, titles, images);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        dataList.setNestedScrollingEnabled(false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}