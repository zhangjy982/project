package com.project.zhang.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class LivingOnlineList {

    @Id
    private Long item_id;
    @Property
    private String item_title;
    @Property
    private String item_content;
    @Property
    private String item_time;
    @Generated(hash = 1228721172)
    public LivingOnlineList(Long item_id, String item_title, String item_content,
            String item_time) {
        this.item_id = item_id;
        this.item_title = item_title;
        this.item_content = item_content;
        this.item_time = item_time;
    }
    @Generated(hash = 982476704)
    public LivingOnlineList() {
    }
    public Long getItem_id() {
        return this.item_id;
    }
    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }
    public String getItem_title() {
        return this.item_title;
    }
    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }
    public String getItem_content() {
        return this.item_content;
    }
    public void setItem_content(String item_content) {
        this.item_content = item_content;
    }
    public String getItem_time() {
        return this.item_time;
    }
    public void setItem_time(String item_time) {
        this.item_time = item_time;
    }
}
