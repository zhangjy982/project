package com.project.zhang.pages;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.zhang.myapplication.R;

public class NewsManagerActivity extends AppCompatActivity {

    private Button addNews;
    private Button editNews;
    private Button queryNews;
    private Button deleteNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_manager);
        init();
        addNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_to_add = new Intent(NewsManagerActivity.this,AddNewsActivity.class);
                startActivity(intent_to_add);
            }
        });
        queryNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_to_list = new Intent(NewsManagerActivity.this,ZhenNewsActivity.class);
                startActivity(intent_to_list);
            }
        });
        deleteNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_to_delete = new Intent(NewsManagerActivity.this,DeleteNewsActivity.class);
                startActivity(intent_to_delete);
            }
        });

    }
    private void init(){

        addNews = (Button)findViewById(R.id.contentNewsManager).findViewById(R.id.add_news);
        editNews = (Button)findViewById(R.id.contentNewsManager).findViewById(R.id.edit_news);
        queryNews = (Button)findViewById(R.id.contentNewsManager).findViewById(R.id.query_news);
        deleteNews = (Button)findViewById(R.id.contentNewsManager).findViewById(R.id.delete_news);
    }
}
