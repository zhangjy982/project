package com.project.zhang.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class OrganizationStructure {

    @Id
    private Long leader_id;
    @Property
    private String leader_name;
    @Property
    private String leader_duty;
    @Property
    private String leader_work;
    @Property
    private String leader_img;
    @Property
    private String employee_name;
    @Property
    private String employee_duty;
    @Property
    private String employee_unit;
    @Generated(hash = 1273375415)
    public OrganizationStructure(Long leader_id, String leader_name,
            String leader_duty, String leader_work, String leader_img,
            String employee_name, String employee_duty, String employee_unit) {
        this.leader_id = leader_id;
        this.leader_name = leader_name;
        this.leader_duty = leader_duty;
        this.leader_work = leader_work;
        this.leader_img = leader_img;
        this.employee_name = employee_name;
        this.employee_duty = employee_duty;
        this.employee_unit = employee_unit;
    }
    @Generated(hash = 137131057)
    public OrganizationStructure() {
    }
    public Long getLeader_id() {
        return this.leader_id;
    }
    public void setLeader_id(Long leader_id) {
        this.leader_id = leader_id;
    }
    public String getLeader_name() {
        return this.leader_name;
    }
    public void setLeader_name(String leader_name) {
        this.leader_name = leader_name;
    }
    public String getLeader_duty() {
        return this.leader_duty;
    }
    public void setLeader_duty(String leader_duty) {
        this.leader_duty = leader_duty;
    }
    public String getLeader_work() {
        return this.leader_work;
    }
    public void setLeader_work(String leader_work) {
        this.leader_work = leader_work;
    }
    public String getLeader_img() {
        return this.leader_img;
    }
    public void setLeader_img(String leader_img) {
        this.leader_img = leader_img;
    }
    public String getEmployee_name() {
        return this.employee_name;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public String getEmployee_duty() {
        return this.employee_duty;
    }
    public void setEmployee_duty(String employee_duty) {
        this.employee_duty = employee_duty;
    }
    public String getEmployee_unit() {
        return this.employee_unit;
    }
    public void setEmployee_unit(String employee_unit) {
        this.employee_unit = employee_unit;
    }

}
