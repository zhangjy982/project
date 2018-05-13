package com.project.zhang.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class ApplicantInformation {

    @Id
    private Long id;
    @Property
    private String iid;
    @Property
    private String user_iid;
    @Property
    private String ensure_number;
    @Property
    private String household_register_address;
    @Property
    private String live_address;
    @Property
    private String reviewe_result;
    @Generated(hash = 1777086697)
    public ApplicantInformation(Long id, String iid, String user_iid,
            String ensure_number, String household_register_address,
            String live_address, String reviewe_result) {
        this.id = id;
        this.iid = iid;
        this.user_iid = user_iid;
        this.ensure_number = ensure_number;
        this.household_register_address = household_register_address;
        this.live_address = live_address;
        this.reviewe_result = reviewe_result;
    }
    @Generated(hash = 1188228946)
    public ApplicantInformation() {
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
    public String getUser_iid() {
        return this.user_iid;
    }
    public void setUser_iid(String user_iid) {
        this.user_iid = user_iid;
    }
    public String getEnsure_number() {
        return this.ensure_number;
    }
    public void setEnsure_number(String ensure_number) {
        this.ensure_number = ensure_number;
    }
    public String getHousehold_register_address() {
        return this.household_register_address;
    }
    public void setHousehold_register_address(String household_register_address) {
        this.household_register_address = household_register_address;
    }
    public String getLive_address() {
        return this.live_address;
    }
    public void setLive_address(String live_address) {
        this.live_address = live_address;
    }
    public String getReviewe_result() {
        return this.reviewe_result;
    }
    public void setReviewe_result(String reviewe_result) {
        this.reviewe_result = reviewe_result;
    }

}
