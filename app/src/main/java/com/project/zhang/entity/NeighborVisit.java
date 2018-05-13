package com.project.zhang.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class NeighborVisit {

    @Id
    private Long id;
    @Property
    private String iid;
    @Property
    private String asked_name;
    @Property
    private String asked_sex;
    @Property
    private String asked_born;
    @Property
    private String asked_nationality;
    @Property
    private String asked_location;
    @Property
    private String asked_nation;
    @Property
    private String asked_culture;
    @Property
    private String asked_tel;
    @Property
    private String asked_papers_type;
    @Property
    private String asked_papers_number;
    @Property
    private String asked_address;
    @Property
    private String asked_times;
    @Property
    private String asked_time_year;
    @Property
    private String asked_time_month;
    @Property
    private String asked_time_day;
    @Property
    private String asked_time_hour;
    @Property
    private String asked_time_minute;
    @Property
    private String asked_place;
    @Property
    private String ask_people_name1;
    @Property
    private String ask_people_number1;
    @Property
    private String ask_people_name2;
    @Property
    private String ask_people_number2;
    @Property
    private String record_people;
    @Property
    private String where_work;
    @Property
    private String specific_thing;
    @Property
    private String above_situation_clea;
    @Property
    private String whether_know_situation;
    @Property
    private String whether_know_people;
    @Property
    private String know_situation;
    @Generated(hash = 1429348139)
    public NeighborVisit(Long id, String iid, String asked_name, String asked_sex,
            String asked_born, String asked_nationality, String asked_location,
            String asked_nation, String asked_culture, String asked_tel,
            String asked_papers_type, String asked_papers_number,
            String asked_address, String asked_times, String asked_time_year,
            String asked_time_month, String asked_time_day, String asked_time_hour,
            String asked_time_minute, String asked_place, String ask_people_name1,
            String ask_people_number1, String ask_people_name2,
            String ask_people_number2, String record_people, String where_work,
            String specific_thing, String above_situation_clea,
            String whether_know_situation, String whether_know_people,
            String know_situation) {
        this.id = id;
        this.iid = iid;
        this.asked_name = asked_name;
        this.asked_sex = asked_sex;
        this.asked_born = asked_born;
        this.asked_nationality = asked_nationality;
        this.asked_location = asked_location;
        this.asked_nation = asked_nation;
        this.asked_culture = asked_culture;
        this.asked_tel = asked_tel;
        this.asked_papers_type = asked_papers_type;
        this.asked_papers_number = asked_papers_number;
        this.asked_address = asked_address;
        this.asked_times = asked_times;
        this.asked_time_year = asked_time_year;
        this.asked_time_month = asked_time_month;
        this.asked_time_day = asked_time_day;
        this.asked_time_hour = asked_time_hour;
        this.asked_time_minute = asked_time_minute;
        this.asked_place = asked_place;
        this.ask_people_name1 = ask_people_name1;
        this.ask_people_number1 = ask_people_number1;
        this.ask_people_name2 = ask_people_name2;
        this.ask_people_number2 = ask_people_number2;
        this.record_people = record_people;
        this.where_work = where_work;
        this.specific_thing = specific_thing;
        this.above_situation_clea = above_situation_clea;
        this.whether_know_situation = whether_know_situation;
        this.whether_know_people = whether_know_people;
        this.know_situation = know_situation;
    }
    @Generated(hash = 675011444)
    public NeighborVisit() {
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
    public String getAsked_name() {
        return this.asked_name;
    }
    public void setAsked_name(String asked_name) {
        this.asked_name = asked_name;
    }
    public String getAsked_sex() {
        return this.asked_sex;
    }
    public void setAsked_sex(String asked_sex) {
        this.asked_sex = asked_sex;
    }
    public String getAsked_born() {
        return this.asked_born;
    }
    public void setAsked_born(String asked_born) {
        this.asked_born = asked_born;
    }
    public String getAsked_nationality() {
        return this.asked_nationality;
    }
    public void setAsked_nationality(String asked_nationality) {
        this.asked_nationality = asked_nationality;
    }
    public String getAsked_location() {
        return this.asked_location;
    }
    public void setAsked_location(String asked_location) {
        this.asked_location = asked_location;
    }
    public String getAsked_nation() {
        return this.asked_nation;
    }
    public void setAsked_nation(String asked_nation) {
        this.asked_nation = asked_nation;
    }
    public String getAsked_culture() {
        return this.asked_culture;
    }
    public void setAsked_culture(String asked_culture) {
        this.asked_culture = asked_culture;
    }
    public String getAsked_tel() {
        return this.asked_tel;
    }
    public void setAsked_tel(String asked_tel) {
        this.asked_tel = asked_tel;
    }
    public String getAsked_papers_type() {
        return this.asked_papers_type;
    }
    public void setAsked_papers_type(String asked_papers_type) {
        this.asked_papers_type = asked_papers_type;
    }
    public String getAsked_papers_number() {
        return this.asked_papers_number;
    }
    public void setAsked_papers_number(String asked_papers_number) {
        this.asked_papers_number = asked_papers_number;
    }
    public String getAsked_address() {
        return this.asked_address;
    }
    public void setAsked_address(String asked_address) {
        this.asked_address = asked_address;
    }
    public String getAsked_times() {
        return this.asked_times;
    }
    public void setAsked_times(String asked_times) {
        this.asked_times = asked_times;
    }
    public String getAsked_time_year() {
        return this.asked_time_year;
    }
    public void setAsked_time_year(String asked_time_year) {
        this.asked_time_year = asked_time_year;
    }
    public String getAsked_time_month() {
        return this.asked_time_month;
    }
    public void setAsked_time_month(String asked_time_month) {
        this.asked_time_month = asked_time_month;
    }
    public String getAsked_time_day() {
        return this.asked_time_day;
    }
    public void setAsked_time_day(String asked_time_day) {
        this.asked_time_day = asked_time_day;
    }
    public String getAsked_time_hour() {
        return this.asked_time_hour;
    }
    public void setAsked_time_hour(String asked_time_hour) {
        this.asked_time_hour = asked_time_hour;
    }
    public String getAsked_time_minute() {
        return this.asked_time_minute;
    }
    public void setAsked_time_minute(String asked_time_minute) {
        this.asked_time_minute = asked_time_minute;
    }
    public String getAsked_place() {
        return this.asked_place;
    }
    public void setAsked_place(String asked_place) {
        this.asked_place = asked_place;
    }
    public String getAsk_people_name1() {
        return this.ask_people_name1;
    }
    public void setAsk_people_name1(String ask_people_name1) {
        this.ask_people_name1 = ask_people_name1;
    }
    public String getAsk_people_number1() {
        return this.ask_people_number1;
    }
    public void setAsk_people_number1(String ask_people_number1) {
        this.ask_people_number1 = ask_people_number1;
    }
    public String getAsk_people_name2() {
        return this.ask_people_name2;
    }
    public void setAsk_people_name2(String ask_people_name2) {
        this.ask_people_name2 = ask_people_name2;
    }
    public String getAsk_people_number2() {
        return this.ask_people_number2;
    }
    public void setAsk_people_number2(String ask_people_number2) {
        this.ask_people_number2 = ask_people_number2;
    }
    public String getRecord_people() {
        return this.record_people;
    }
    public void setRecord_people(String record_people) {
        this.record_people = record_people;
    }
    public String getWhere_work() {
        return this.where_work;
    }
    public void setWhere_work(String where_work) {
        this.where_work = where_work;
    }
    public String getSpecific_thing() {
        return this.specific_thing;
    }
    public void setSpecific_thing(String specific_thing) {
        this.specific_thing = specific_thing;
    }
    public String getAbove_situation_clea() {
        return this.above_situation_clea;
    }
    public void setAbove_situation_clea(String above_situation_clea) {
        this.above_situation_clea = above_situation_clea;
    }
    public String getWhether_know_situation() {
        return this.whether_know_situation;
    }
    public void setWhether_know_situation(String whether_know_situation) {
        this.whether_know_situation = whether_know_situation;
    }
    public String getWhether_know_people() {
        return this.whether_know_people;
    }
    public void setWhether_know_people(String whether_know_people) {
        this.whether_know_people = whether_know_people;
    }
    public String getKnow_situation() {
        return this.know_situation;
    }
    public void setKnow_situation(String know_situation) {
        this.know_situation = know_situation;
    }
}
