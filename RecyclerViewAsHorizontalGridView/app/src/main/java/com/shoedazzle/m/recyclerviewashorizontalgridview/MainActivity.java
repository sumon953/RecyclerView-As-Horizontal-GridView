package com.shoedazzle.m.recyclerviewashorizontalgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // ArrayList for person names
    ArrayList personName = new ArrayList<>(Arrays.asList("Person1","Person2","Person3","Person4","Person5","Person6","Person7","Person8","Person9","Person10","Person11","Person12","Person13","Person14"));
    ArrayList personImage = new ArrayList<>(Arrays.asList(R.drawable.im1,R.drawable.im2,R.drawable.im3,R.drawable.im4,R.drawable.im5,R.drawable.im6,R.drawable.im7,R.drawable.im8,R.drawable.im9,R.drawable.im10,R.drawable.im11,R.drawable.im12,R.drawable.im13,R.drawable.im14));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. get the reference of RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //2. set a GridLayoutManager with 3 number of columns , horizontal gravity and false value for reverseLayout to show the items from start to end
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);

        //3.  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,personName,personImage);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView

    }
}
