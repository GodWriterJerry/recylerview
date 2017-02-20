package com.example.yls.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Kobe>mKobeList=new ArrayList<Kobe>();
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initKobeList();
        initViews();
    }

    private void initViews() {
        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        LinearLayoutManager manger=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manger);
        mAdapter=new MyAdapter(mKobeList);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initKobeList() {
        mKobeList.add(new Kobe("kobe1",R.drawable.k1));
        mKobeList.add(new Kobe("kobe2",R.drawable.k2));
        mKobeList.add(new Kobe("kobe3",R.drawable.k3));
        mKobeList.add(new Kobe("kobe4",R.drawable.k4));
        mKobeList.add(new Kobe("kobe5",R.drawable.k5));
        mKobeList.add(new Kobe("kobe6",R.drawable.k6));
        mKobeList.add(new Kobe("kobe7",R.drawable.k7));
    }
}
