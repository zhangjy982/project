package com.project.zhang.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class FamilyRegister03 {

    @Id
    private Long id;
    @Property
    private String iid;
    @Property
    private String applicant_iid;
    @Property
    private String poverty_reason;
    @Property
    private String statement;
    @Property
    private String apply_time;
    @Generated(hash = 1235074994)
    public FamilyRegister03(Long id, String iid, String applicant_iid,
            String poverty_reason, String statement, String apply_time) {
        this.id = id;
        this.iid = iid;
        this.applicant_iid = applicant_iid;
        this.poverty_reason = poverty_reason;
        this.statement = statement;
        this.apply_time = apply_time;
    }
    @Generated(hash = 206780372)
    public FamilyRegister03() {
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
    public String getApplicant_iid() {
        return this.applicant_iid;
    }
    public void setApplicant_iid(String applicant_iid) {
        this.applicant_iid = applicant_iid;
    }
    public String getPoverty_reason() {
        return this.poverty_reason;
    }
    public void setPoverty_reason(String poverty_reason) {
        this.poverty_reason = poverty_reason;
    }
    public String getStatement() {
        return this.statement;
    }
    public void setStatement(String statement) {
        this.statement = statement;
    }
    public String getApply_time() {
        return this.apply_time;
    }
    public void setApply_time(String apply_time) {
        this.apply_time = apply_time;
    }

}
