package com.project.zhang.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class FamilySituationInvest {

    @Id
    private Long id;
    @Property
    private String iid;
    @Property
    private String applicant_iid;
    @Property
    private String family1_iid;
    @Property
    private String family2_iid;
    @Property
    private String decorate_situation;
    @Property
    private String home_appliances;
    @Property
    private String water_money_month;
    @Property
    private String phone_money_month;
    @Property
    private String unlive_need;
    @Property
    private String children_study_situation;
    @Property
    private String valuables;
    @Property
    private String other_bad_situation;
    @Property
    private String hard_mix_situation;
    @Property
    private String whether_same;
    @Property
    private String applicant_opinion;
    @Generated(hash = 1579018435)
    public FamilySituationInvest(Long id, String iid, String applicant_iid,
            String family1_iid, String family2_iid, String decorate_situation,
            String home_appliances, String water_money_month,
            String phone_money_month, String unlive_need,
            String children_study_situation, String valuables,
            String other_bad_situation, String hard_mix_situation,
            String whether_same, String applicant_opinion) {
        this.id = id;
        this.iid = iid;
        this.applicant_iid = applicant_iid;
        this.family1_iid = family1_iid;
        this.family2_iid = family2_iid;
        this.decorate_situation = decorate_situation;
        this.home_appliances = home_appliances;
        this.water_money_month = water_money_month;
        this.phone_money_month = phone_money_month;
        this.unlive_need = unlive_need;
        this.children_study_situation = children_study_situation;
        this.valuables = valuables;
        this.other_bad_situation = other_bad_situation;
        this.hard_mix_situation = hard_mix_situation;
        this.whether_same = whether_same;
        this.applicant_opinion = applicant_opinion;
    }
    @Generated(hash = 2124445552)
    public FamilySituationInvest() {
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
    public String getFamily1_iid() {
        return this.family1_iid;
    }
    public void setFamily1_iid(String family1_iid) {
        this.family1_iid = family1_iid;
    }
    public String getFamily2_iid() {
        return this.family2_iid;
    }
    public void setFamily2_iid(String family2_iid) {
        this.family2_iid = family2_iid;
    }
    public String getDecorate_situation() {
        return this.decorate_situation;
    }
    public void setDecorate_situation(String decorate_situation) {
        this.decorate_situation = decorate_situation;
    }
    public String getHome_appliances() {
        return this.home_appliances;
    }
    public void setHome_appliances(String home_appliances) {
        this.home_appliances = home_appliances;
    }
    public String getWater_money_month() {
        return this.water_money_month;
    }
    public void setWater_money_month(String water_money_month) {
        this.water_money_month = water_money_month;
    }
    public String getPhone_money_month() {
        return this.phone_money_month;
    }
    public void setPhone_money_month(String phone_money_month) {
        this.phone_money_month = phone_money_month;
    }
    public String getUnlive_need() {
        return this.unlive_need;
    }
    public void setUnlive_need(String unlive_need) {
        this.unlive_need = unlive_need;
    }
    public String getChildren_study_situation() {
        return this.children_study_situation;
    }
    public void setChildren_study_situation(String children_study_situation) {
        this.children_study_situation = children_study_situation;
    }
    public String getValuables() {
        return this.valuables;
    }
    public void setValuables(String valuables) {
        this.valuables = valuables;
    }
    public String getOther_bad_situation() {
        return this.other_bad_situation;
    }
    public void setOther_bad_situation(String other_bad_situation) {
        this.other_bad_situation = other_bad_situation;
    }
    public String getHard_mix_situation() {
        return this.hard_mix_situation;
    }
    public void setHard_mix_situation(String hard_mix_situation) {
        this.hard_mix_situation = hard_mix_situation;
    }
    public String getWhether_same() {
        return this.whether_same;
    }
    public void setWhether_same(String whether_same) {
        this.whether_same = whether_same;
    }
    public String getApplicant_opinion() {
        return this.applicant_opinion;
    }
    public void setApplicant_opinion(String applicant_opinion) {
        this.applicant_opinion = applicant_opinion;
    }

}
