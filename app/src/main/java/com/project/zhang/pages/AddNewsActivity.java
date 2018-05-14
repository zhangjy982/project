package com.project.zhang.pages;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.zhang.myapplication.R;
import com.project.zhang.dao.DaoMaster;
import com.project.zhang.dao.DaoSession;
import com.project.zhang.dao.NewsListDao;
import com.project.zhang.db.NewsListDaoOpe;
import com.project.zhang.entity.NewsList;

import java.util.ArrayList;
import java.util.List;

public class AddNewsActivity extends AppCompatActivity {
    private Spinner editType;
    private EditText newsTitle;
    private EditText newsContent;
    private Button addNews;
    private List<NewsList> newsList = new ArrayList<>();
    private int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_news);
        init();
        addNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id++;
                getDataCun(id);
                NewsListDaoOpe.insertData(AddNewsActivity.this,newsList);
                newsList.clear();
                Toast.makeText(AddNewsActivity.this,"添加成功",Toast.LENGTH_SHORT).show();
            }
        });

    }

    //插入新闻数据
    private void getDataCun(int i){

        String news_type = "村级";
        String news_title = newsTitle.getText().toString();
        String news_content = newsContent.getText().toString();
        NewsList news = new NewsList((long) i,news_type,news_title,news_content);
        newsList.add(news);
    }

    private void getDataZhen(){
        String news_type = "镇级";
        String news_title = newsTitle.getText().toString();
        String news_content = newsContent.getText().toString();
        NewsList news = new NewsList((long) 100,news_type,news_title,news_content);
        newsList.add(news);
    }
    private void init(){
        editType = (Spinner)findViewById(R.id.news_type);
        newsTitle = (EditText)findViewById(R.id.news_title);
        newsContent = (EditText)findViewById(R.id.news_content);
        addNews = (Button)findViewById(R.id.news_add);
    }



}
