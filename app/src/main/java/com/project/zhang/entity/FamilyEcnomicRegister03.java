package com.project.zhang.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class FamilyEcnomicRegister03 {

    @Id
    private Long id;
    @Property
    private String iid;
    @Property
    private String applicant_iid;
    @Property
    private String family_cost_1;
    @Property
    private String family_cost_2;
    @Property
    private String family_cost_3;
    @Property
    private String family_cost_4;
    @Property
    private String family_cost_5;
    @Property
    private String family_cost_6;
    @Generated(hash = 402868367)
    public FamilyEcnomicRegister03(Long id, String iid, String applicant_iid,
            String family_cost_1, String family_cost_2, String family_cost_3,
            String family_cost_4, String family_cost_5, String family_cost_6) {
        this.id = id;
        this.iid = iid;
        this.applicant_iid = applicant_iid;
        this.family_cost_1 = family_cost_1;
        this.family_cost_2 = family_cost_2;
        this.family_cost_3 = family_cost_3;
        this.family_cost_4 = family_cost_4;
        this.family_cost_5 = family_cost_5;
        this.family_cost_6 = family_cost_6;
    }
    @Generated(hash = 1935737144)
    public FamilyEcnomicRegister03() {
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
    public String getFamily_cost_1() {
        return this.family_cost_1;
    }
    public void setFamily_cost_1(String family_cost_1) {
        this.family_cost_1 = family_cost_1;
    }
    public String getFamily_cost_2() {
        return this.family_cost_2;
    }
    public void setFamily_cost_2(String family_cost_2) {
        this.family_cost_2 = family_cost_2;
    }
    public String getFamily_cost_3() {
        return this.family_cost_3;
    }
    public void setFamily_cost_3(String family_cost_3) {
        this.family_cost_3 = family_cost_3;
    }
    public String getFamily_cost_4() {
        return this.family_cost_4;
    }
    public void setFamily_cost_4(String family_cost_4) {
        this.family_cost_4 = family_cost_4;
    }
    public String getFamily_cost_5() {
        return this.family_cost_5;
    }
    public void setFamily_cost_5(String family_cost_5) {
        this.family_cost_5 = family_cost_5;
    }
    public String getFamily_cost_6() {
        return this.family_cost_6;
    }
    public void setFamily_cost_6(String family_cost_6) {
        this.family_cost_6 = family_cost_6;
    }

}
