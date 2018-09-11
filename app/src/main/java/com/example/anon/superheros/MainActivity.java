package com.example.anon.superheros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");
        initImageBitmaps();
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: Bit maps Initiated");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/10/103530/6444044-4130984370-aHR0cDovL3d3dy5uZXdzYXJhbWEuY29tL2ltYWdlcy9pLzAwMC8yMjcvMjY2L29yaWdpbmFsL0pMXzFfdmFyX01hcmtfQnJvb2tzX2IuanBn");
        mNames.add("Wonder Women");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/13/132327/6507037-28872490_1638064799604695_1250122498385004714_n.jpg");
        mNames.add("Super Man");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/10/100647/6198653-batman+12.jpg");
        mNames.add("Bat Man");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/11124/111242198/4833020-mark_bagley_spider_man.jpg");
        mNames.add("Spider Man");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/10/100647/6436253-thor2.jpg");
        mNames.add("Thor");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/11114/111147698/6520709-1532011657748.jpg");
        mNames.add("Hal Jordan");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/13/132327/6421118-captain_america_2_by_leinilyu-d4jupy4.jpg");
        mNames.add("Captain America");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/10/103530/6444307-7938467445-STL082429");
        mNames.add("Martian Man Hunter");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/10/100647/6436334-nightwing+39+yasmine+putri+variant.jpg");
        mNames.add("Dick Greyson");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/10/100647/4446651-4312381-4277754-57b%2Bff_644_variant.jpg");
        mNames.add("Invisible Women");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: Reycler View Initiated");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
