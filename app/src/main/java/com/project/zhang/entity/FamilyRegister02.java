package com.project.zhang.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class FamilyRegister02 {

    @Id
    private Long id;
    @Property
    private String iid;
    @Property
    private String applicant_iid;
    @Property
    private String applicant_relationship;
    @Property
    private String name;
    @Property
    private String raise_ability;
    @Property
    private String no_raise_reason;
    @Property
    private String id_number;
    @Property
    private String family_address;
    @Property
    private String raise_money;
    @Property
    private String people_type;
    @Generated(hash = 100669192)
    public FamilyRegister02(Long id, String iid, String applicant_iid,
            String applicant_relationship, String name, String raise_ability,
            String no_raise_reason, String id_number, String family_address,
            String raise_money, String people_type) {
        this.id = id;
        this.iid = iid;
        this.applicant_iid = applicant_iid;
        this.applicant_relationship = applicant_relationship;
        this.name = name;
        this.raise_ability = raise_ability;
        this.no_raise_reason = no_raise_reason;
        this.id_number = id_number;
        this.family_address = family_address;
        this.raise_money = raise_money;
        this.people_type = people_type;
    }
    @Generated(hash = 1173370982)
    public FamilyRegister02() {
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
    public String getApplicant_relationship() {
        return this.applicant_relationship;
    }
    public void setApplicant_relationship(String applicant_relationship) {
        this.applicant_relationship = applicant_relationship;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRaise_ability() {
        return this.raise_ability;
    }
    public void setRaise_ability(String raise_ability) {
        this.raise_ability = raise_ability;
    }
    public String getNo_raise_reason() {
        return this.no_raise_reason;
    }
    public void setNo_raise_reason(String no_raise_reason) {
        this.no_raise_reason = no_raise_reason;
    }
    public String getId_number() {
        return this.id_number;
    }
    public void setId_number(String id_number) {
        this.id_number = id_number;
    }
    public String getFamily_address() {
        return this.family_address;
    }
    public void setFamily_address(String family_address) {
        this.family_address = family_address;
    }
    public String getRaise_money() {
        return this.raise_money;
    }
    public void setRaise_money(String raise_money) {
        this.raise_money = raise_money;
    }
    public String getPeople_type() {
        return this.people_type;
    }
    public void setPeople_type(String people_type) {
        this.people_type = people_type;
    }

}
