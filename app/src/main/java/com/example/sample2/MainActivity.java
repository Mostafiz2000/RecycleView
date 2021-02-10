package com.example.sample2;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
Button button;
    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Language_Movement_monument_of_CUET_Uploaded_by_Rahat.jpg/220px-Language_Movement_monument_of_CUET_Uploaded_by_Rahat.jpg");
                mNames.add("CUET");
                initRecyclerView();
            }
        });
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");



        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Language_Movement_monument_of_CUET_Uploaded_by_Rahat.jpg/220px-Language_Movement_monument_of_CUET_Uploaded_by_Rahat.jpg");
        mNames.add("Centre Shahid Minar");

        mImageUrls.add("https://blog.ysibangla.com/wp-content/uploads/2018/10/CUET-Logo.jpg");
        mNames.add("CUET logo");

        mImageUrls.add("https://d30fl32nd2baj9.cloudfront.net/media/2017/09/17/cuet.jpg/ALTERNATES/w640/CUET.jpg");
        mNames.add("Cuet Gate");


        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");


        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");

        initRecyclerView();
    }


    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);

        RecycleViewAdapter adapter;
        adapter = new RecycleViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}


