package com.project.zhang.pages;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zhang.myapplication.R;
import com.project.zhang.db.NewsListDaoOpe;
import com.project.zhang.entity.NewsList;

import java.util.List;

public class ZhenNewsActivity extends AppCompatActivity {

    private ImageView ivIcon;
    private TextView tvTitle;
    private TextView tvDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_news);
        init();
        setNews();
    }
    private void init(){

        ivIcon = (ImageView)findViewById(R.id.iv_icon);
        tvTitle = (TextView)findViewById(R.id.tv_title);
        tvDes = (TextView)findViewById(R.id.tv_des);
    }
    private void setNews(){
        List<NewsList> news = NewsListDaoOpe.queryAll(this);
        if(news.size() != 0){
            tvTitle.setText(news.get(0).getTitle().toString());
            //tvDes.setText(news.get(1).getNews_content());
            tvDes.setText("test");
        }
        else{

        }
    }
}
