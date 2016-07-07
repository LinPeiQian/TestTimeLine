package com.example.user.testtimeline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  ListViewForScrollView listview;

    private List<String> mData = new ArrayList<>();

    private MyAdapter mAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mData.add("");
        mData.add("");
        mData.add("");
        mData.add("");
        mData.add("");
        mAdapter = new MyAdapter(this);
        listview = (ListViewForScrollView)findViewById(R.id.listview);
        mAdapter.setData(mData);
        listview.setAdapter(mAdapter);
        View view = LayoutInflater.from(this).inflate(R.layout.item_lv_header , null);
        listview.addHeaderView(view);
    }
}
