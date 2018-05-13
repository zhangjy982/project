package com.project.zhang.pages;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.zhang.myapplication.R;
import com.project.zhang.db.NewsListDaoOpe;

public class DeleteNewsActivity extends AppCompatActivity{
    private Button deleteNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_news);
        init();
        deleteNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewsListDaoOpe.deleteAllData(DeleteNewsActivity.this);
            }
        });
    }
    private void init(){
        deleteNews = (Button)findViewById(R.id.contentDeleteNews).findViewById(R.id.delete_news);
    }
}
