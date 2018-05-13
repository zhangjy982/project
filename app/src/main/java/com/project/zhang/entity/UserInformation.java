package com.project.zhang.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class UserInformation {

    @Id
    private Long id;
    @Property(nameInDb = "iid")
    private String iid;
    @Property(nameInDb = "true_name")
    private String true_name;
    @Property(nameInDb = "sex")
    private String sex;
    @Property(nameInDb = "tel")
    private String tel;
    @Property(nameInDb = "id_number")
    private String id_number;
    @Property(nameInDb = "location")
    private String location;
    @Property(nameInDb = "permission")
    private String permission;
    @Property(nameInDb = "password")
    private String password;
    @Property(nameInDb = "time")
    private String time;
    @Generated(hash = 547077649)
    public UserInformation(Long id, String iid, String true_name, String sex,
            String tel, String id_number, String location, String permission,
            String password, String time) {
        this.id = id;
        this.iid = iid;
        this.true_name = true_name;
        this.sex = sex;
        this.tel = tel;
        this.id_number = id_number;
        this.location = location;
        this.permission = permission;
        this.password = password;
        this.time = time;
    }
    @Generated(hash = 1920987651)
    public UserInformation() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIid() {
        return this.iid;
    }
    public void setIid(String iid) {
        this.iid = iid;
    }
    public String getTrue_name() {
        return this.true_name;
    }
    public void setTrue_name(String true_name) {
        this.true_name = true_name;
    }
    public String getSex() {
        return this.sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getTel() {
        return this.tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getId_number() {
        return this.id_number;
    }
    public void setId_number(String id_number) {
        this.id_number = id_number;
    }
    public String getLocation() {
        return this.location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getPermission() {
        return this.permission;
    }
    public void setPermission(String permission) {
        this.permission = permission;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getTime() {
        return this.time;
    }
    public void setTime(String time) {
        this.time = time;
    }

}
