package com.project.zhang.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class NewsList {

    @Id
    private Long news_id;
    @Property(nameInDb = "type")
    private String type;
    @Property(nameInDb = "title")
    private String title;
    @Property(nameInDb = "news_content")
    private String news_content;
    @Generated(hash = 32999211)
    public NewsList(Long news_id, String type, String title, String news_content) {
        this.news_id = news_id;
        this.type = type;
        this.title = title;
        this.news_content = news_content;
    }
    @Generated(hash = 1806220618)
    public NewsList() {
    }
    public Long getNews_id() {
        return this.news_id;
    }
    public void setNews_id(Long news_id) {
        this.news_id = news_id;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getNews_content() {
        return this.news_content;
    }
    public void setNews_content(String news_content) {
        this.news_content = news_content;
    }

}
