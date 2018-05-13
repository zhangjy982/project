package com.project.zhang.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class PeopleMeetingRecord {

    @Id
    private Long id;
    @Property
    private String iid;
    @Property
    private String dibao_people;
    @Property
    private String household_number;
    @Property
    private String meeting_time;
    @Property
    private String meeting_place;
    @Property
    private String host;
    @Property
    private String people_represent;
    @Property
    private String committee_represent;
    @Property
    private String organization_represent;
    @Property
    private String record_people;
    @Property
    private String agree_number;
    @Property
    private String disagree_number;
    @Generated(hash = 1492723636)
    public PeopleMeetingRecord(Long id, String iid, String dibao_people,
            String household_number, String meeting_time, String meeting_place,
            String host, String people_represent, String committee_represent,
            String organization_represent, String record_people,
            String agree_number, String disagree_number) {
        this.id = id;
        this.iid = iid;
        this.dibao_people = dibao_people;
        this.household_number = household_number;
        this.meeting_time = meeting_time;
        this.meeting_place = meeting_place;
        this.host = host;
        this.people_represent = people_represent;
        this.committee_represent = committee_represent;
        this.organization_represent = organization_represent;
        this.record_people = record_people;
        this.agree_number = agree_number;
        this.disagree_number = disagree_number;
    }
    @Generated(hash = 1645014267)
    public PeopleMeetingRecord() {
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
    public String getDibao_people() {
        return this.dibao_people;
    }
    public void setDibao_people(String dibao_people) {
        this.dibao_people = dibao_people;
    }
    public String getHousehold_number() {
        return this.household_number;
    }
    public void setHousehold_number(String household_number) {
        this.household_number = household_number;
    }
    public String getMeeting_time() {
        return this.meeting_time;
    }
    public void setMeeting_time(String meeting_time) {
        this.meeting_time = meeting_time;
    }
    public String getMeeting_place() {
        return this.meeting_place;
    }
    public void setMeeting_place(String meeting_place) {
        this.meeting_place = meeting_place;
    }
    public String getHost() {
        return this.host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getPeople_represent() {
        return this.people_represent;
    }
    public void setPeople_represent(String people_represent) {
        this.people_represent = people_represent;
    }
    public String getCommittee_represent() {
        return this.committee_represent;
    }
    public void setCommittee_represent(String committee_represent) {
        this.committee_represent = committee_represent;
    }
    public String getOrganization_represent() {
        return this.organization_represent;
    }
    public void setOrganization_represent(String organization_represent) {
        this.organization_represent = organization_represent;
    }
    public String getRecord_people() {
        return this.record_people;
    }
    public void setRecord_people(String record_people) {
        this.record_people = record_people;
    }
    public String getAgree_number() {
        return this.agree_number;
    }
    public void setAgree_number(String agree_number) {
        this.agree_number = agree_number;
    }
    public String getDisagree_number() {
        return this.disagree_number;
    }
    public void setDisagree_number(String disagree_number) {
        this.disagree_number = disagree_number;
    }

}
