package com.project.zhang.pages;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ScrollView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.zhang.myapplication.R;
import com.project.zhang.adapter.MyPagerAdapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntroduceActivity extends AppCompatActivity{

    private ViewPager vpager_one;
    private ArrayList<View> aList;
    private MyPagerAdapter mAdapter;
    private ArrayList<String> sList;

    private ScrollView scrollView;
    private TextView leaderName;
    private TextView leaderWork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce);
        vpager_one = (ViewPager) findViewById(R.id.contentIntroduce).findViewById(R.id.introduce_viewpager);
        //viewPager功能实现
        aList = new ArrayList<View>();
        LayoutInflater li = getLayoutInflater();
        aList.add(li.inflate(R.layout.content_leader,null,false));
        aList.add(li.inflate(R.layout.content_employee,null,false));

        sList = new ArrayList<String>();
        sList.add("镇政府领导");
        sList.add("村公务人员");

        mAdapter = new MyPagerAdapter(aList,sList);
        vpager_one.setAdapter(mAdapter);


        Toolbar back_tool = findViewById(R.id.introduce_toolbar);
        setSupportActionBar(back_tool);
        back_tool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntroduceActivity.this.finish();
            }
        });

    }
}
