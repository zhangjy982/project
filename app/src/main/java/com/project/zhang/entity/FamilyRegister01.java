package com.project.zhang.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class FamilyRegister01 {

    @Id
    private Long id;
    @Property
    private String iid;
    @Property
    private String applicant_iid;
    @Property
    private String name;
    @Property
    private String id_number;
    @Property
    private String live_number;
    @Property
    private String sex;
    @Property
    private String nation;
    @Property
    private String political_outlook;
    @Property
    private String culture;
    @Property
    private String marriage;
    @Property
    private String family_relationship;
    @Property
    private String city_or_village;
    @Property
    private String body_situation;
    @Property
    private String work_ability;
    @Property
    private String disease;
    @Property
    private String disability_type;
    @Property
    private String disability_level;
    @Property
    private String identity_type;
    @Property
    private String work_situation;
    @Property
    private String study_situation;
    @Property
    private String insurance_situation;
    @Property
    private String photo;
    @Property
    private String people_type;
    @Generated(hash = 2064635323)
    public FamilyRegister01(Long id, String iid, String applicant_iid, String name,
            String id_number, String live_number, String sex, String nation,
            String political_outlook, String culture, String marriage,
            String family_relationship, String city_or_village,
            String body_situation, String work_ability, String disease,
            String disability_type, String disability_level, String identity_type,
            String work_situation, String study_situation,
            String insurance_situation, String photo, String people_type) {
        this.id = id;
        this.iid = iid;
        this.applicant_iid = applicant_iid;
        this.name = name;
        this.id_number = id_number;
        this.live_number = live_number;
        this.sex = sex;
        this.nation = nation;
        this.political_outlook = political_outlook;
        this.culture = culture;
        this.marriage = marriage;
        this.family_relationship = family_relationship;
        this.city_or_village = city_or_village;
        this.body_situation = body_situation;
        this.work_ability = work_ability;
        this.disease = disease;
        this.disability_type = disability_type;
        this.disability_level = disability_level;
        this.identity_type = identity_type;
        this.work_situation = work_situation;
        this.study_situation = study_situation;
        this.insurance_situation = insurance_situation;
        this.photo = photo;
        this.people_type = people_type;
    }
    @Generated(hash = 787409220)
    public FamilyRegister01() {
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
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId_number() {
        return this.id_number;
    }
    public void setId_number(String id_number) {
        this.id_number = id_number;
    }
    public String getLive_number() {
        return this.live_number;
    }
    public void setLive_number(String live_number) {
        this.live_number = live_number;
    }
    public String getSex() {
        return this.sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getNation() {
        return this.nation;
    }
    public void setNation(String nation) {
        this.nation = nation;
    }
    public String getPolitical_outlook() {
        return this.political_outlook;
    }
    public void setPolitical_outlook(String political_outlook) {
        this.political_outlook = political_outlook;
    }
    public String getCulture() {
        return this.culture;
    }
    public void setCulture(String culture) {
        this.culture = culture;
    }
    public String getMarriage() {
        return this.marriage;
    }
    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }
    public String getFamily_relationship() {
        return this.family_relationship;
    }
    public void setFamily_relationship(String family_relationship) {
        this.family_relationship = family_relationship;
    }
    public String getCity_or_village() {
        return this.city_or_village;
    }
    public void setCity_or_village(String city_or_village) {
        this.city_or_village = city_or_village;
    }
    public String getBody_situation() {
        return this.body_situation;
    }
    public void setBody_situation(String body_situation) {
        this.body_situation = body_situation;
    }
    public String getWork_ability() {
        return this.work_ability;
    }
    public void setWork_ability(String work_ability) {
        this.work_ability = work_ability;
    }
    public String getDisease() {
        return this.disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public String getDisability_type() {
        return this.disability_type;
    }
    public void setDisability_type(String disability_type) {
        this.disability_type = disability_type;
    }
    public String getDisability_level() {
        return this.disability_level;
    }
    public void setDisability_level(String disability_level) {
        this.disability_level = disability_level;
    }
    public String getIdentity_type() {
        return this.identity_type;
    }
    public void setIdentity_type(String identity_type) {
        this.identity_type = identity_type;
    }
    public String getWork_situation() {
        return this.work_situation;
    }
    public void setWork_situation(String work_situation) {
        this.work_situation = work_situation;
    }
    public String getStudy_situation() {
        return this.study_situation;
    }
    public void setStudy_situation(String study_situation) {
        this.study_situation = study_situation;
    }
    public String getInsurance_situation() {
        return this.insurance_situation;
    }
    public void setInsurance_situation(String insurance_situation) {
        this.insurance_situation = insurance_situation;
    }
    public String getPhoto() {
        return this.photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getPeople_type() {
        return this.people_type;
    }
    public void setPeople_type(String people_type) {
        this.people_type = people_type;
    }

}
