package com.pens.projectonedts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycleView;
    private WordListAdapter mAdapter;
    private final List<String> mWordList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0 ; i < 20 ; i++){
            mWordList.add("Word"+i);
        }

        mRecycleView = findViewById(R.id.recycleview);
        mAdapter = new WordListAdapter(mWordList);
        mRecycleView.setAdapter(mAdapter);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
    }
}
